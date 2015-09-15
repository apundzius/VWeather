package com.accuweather.algirdas.vweather.ChooseCity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

import com.accuweather.algirdas.vweather.ChooseCity.JsonData.ChooseCityData;
import com.accuweather.algirdas.vweather.Constants;
import com.accuweather.algirdas.vweather.DataSingleton;
import com.accuweather.algirdas.vweather.R;
import com.accuweather.algirdas.vweather.Utilities;
import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

/**
 * Created by Algirdas on 2015.09.10.
 */
public class CityChooser {

    public static void lookUpForCity(final Activity act, String city)
    {
        Ion.with(act.getApplicationContext())
                .load(Constants.LOOK_UP_FOR_CITY(city))
                .as(new TypeToken<ChooseCityData>() {
                })
                .setCallback(new FutureCallback<ChooseCityData>() {
                    @Override
                    public void onCompleted(Exception e, ChooseCityData data) {

                        if (e != null)
                            e.printStackTrace();
                        else {
                            chooseCity(act, data);
                        }
                    }
                });
    }

    private static void chooseCity(final Activity act, final ChooseCityData data) {
        AlertDialog.Builder b = new AlertDialog.Builder(act);

        if(data.getRESULTS().size() == 0)
            Utilities.showNotification(act.getApplicationContext(), act.getString(R.string.NoSuchCity), Toast.LENGTH_LONG);
        else {
            if(data.getRESULTS().size() == 1)
                DataSingleton.getInstance(act.getApplicationContext()).getData(act, data.getRESULTS().get(0).getL());
            else
            {
                b.setItems(getNameStringArrayFromResults(data), new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        DataSingleton.getInstance(act.getApplicationContext()).getData(act, data.getRESULTS().get(which).getL());
                        dialog.dismiss();
                    }
                });

                b.show();
            }
        }
    }

    private static String[] getNameStringArrayFromResults(ChooseCityData data)
    {
        String[] stringArray = new String[data.getRESULTS().size()];
        for (int i = 0; i < data.getRESULTS().size(); i++) {
            stringArray[i] = data.getRESULTS().get(i).getName();
        }
        return stringArray;
    }
}
