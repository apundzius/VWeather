package com.accuweather.algirdas.vweather;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;

import com.accuweather.algirdas.vweather.DailyForecast.JsonData.HourlyHistory;
import com.accuweather.algirdas.vweather.CurrentForecast.JsonData.CurrentSituation;
import com.accuweather.algirdas.vweather.Forecast7Day.JsonData.Forecast7Day;
import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

/**
 * Created by Algirdas on 2015.09.03.
 */
public class DataSingleton {

    private static DataSingleton instance = null;
    private CurrentSituation data;
    private HourlyHistory hourlyData;
    private Forecast7Day forecast7Day;

    private Context context;
    protected DataSingleton() {
    }


    public static DataSingleton getInstance(Context context) {
        if(instance == null) {
            instance = new DataSingleton();
            instance.context = context;
        }
        return instance;
    }

    public boolean hasData()
    {
        if(hourlyData != null && data != null && forecast7Day != null)
            return true;
        else
            return false;
    }

    private boolean checkIfAllIsLoaded()
    {
        if(hourlyData != null && data != null && forecast7Day != null) {
            sendMessage("update");
            return true;
        }
        else
            return false;
    }

    private void dataLoading(Activity act, String forCity)
    {
        final ProgressDialog progress = ProgressDialog.show(act, "Please wait",
                "Loading...", true);
        progress.show();

        Ion.with(context)
                .load(Constants.CURRENT_STATUS_URL(forCity))
                .as(new TypeToken<CurrentSituation>() {
                })
                .setCallback(new FutureCallback<CurrentSituation>() {
                    @Override
                    public void onCompleted(Exception e, CurrentSituation data) {

                        if (e != null)
                            e.printStackTrace();
                        else {
                            setCurrentData(data);
                            if(checkIfAllIsLoaded())
                                progress.dismiss();
                        }
                    }
                });

        Ion.with(context)
                .load(Constants.HOURLY_STATUS_URL(forCity))
                .as(new TypeToken<HourlyHistory>() {
                })
                .setCallback(new FutureCallback<HourlyHistory>() {
                    @Override
                    public void onCompleted(Exception e, HourlyHistory data) {

                        if (e != null)
                            e.printStackTrace();
                        else {
                            setHourlyData(data);
                            if(checkIfAllIsLoaded())
                                progress.dismiss();
                        }
                    }
                });

        Ion.with(context)
                .load(Constants.FORECAST_10DAY_URL(forCity))
                .as(new TypeToken<Forecast7Day>() {
                })
                .setCallback(new FutureCallback<Forecast7Day>() {
                    @Override
                    public void onCompleted(Exception e, Forecast7Day data) {

                        if (e != null)
                            e.printStackTrace();
                        else {
                            setForecast10Day(data);
                            if(checkIfAllIsLoaded())
                                progress.dismiss();
                        }
                    }
                });
    }

    public void getData(Activity act, String forCity)
    {
        if(Utilities.isOnline(context))
            dataLoading(act, forCity);
        else
            Utilities.showNotification(context, context.getString(R.string.NoInternetConnection), Toast.LENGTH_LONG);
    }

    private void sendMessage(String message) {
        Intent intent = new Intent("LocalBroadcaster");
        intent.putExtra("message", message);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public void setCurrentData(CurrentSituation data)
    {
        this.data = data;
    }

    public CurrentSituation getCurrentData()
    {
        return data;
    }

    public void setHourlyData(HourlyHistory data)
    {
        this.hourlyData = data;
    }

    public HourlyHistory getHourlyData()
    {
        return hourlyData;
    }

    public void setForecast10Day(Forecast7Day data)
    {
        this.forecast7Day = data;
    }

    public Forecast7Day getForecast10Day()
    {
        return forecast7Day;
    }
}