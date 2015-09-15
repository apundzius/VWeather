package com.accuweather.algirdas.vweather.DailyForecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.accuweather.algirdas.vweather.R;
import com.accuweather.algirdas.vweather.DailyForecast.JsonData.HourlyHistory;
import com.accuweather.algirdas.vweather.BaseFragment;

/**
 * Created by Algirdas on 2015.09.03.
 */
public class DailyForecastFragment extends BaseFragment {

    View view;

    public static DailyForecastFragment newInstance() {
        return new DailyForecastFragment();

    }


    public DailyForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_daily, container, false);
        dataLoaded();
        return view;
    }


    public void initDesign()
    {
        HourlyHistory data = dataProvider.getHourlyData();

        ListView list = (ListView) view.findViewById(R.id.listView);

        DailyForecastAdapter customAdapter = new DailyForecastAdapter(this.getActivity().getApplicationContext(), R.layout.hourly_row, data.getHourlyForecast());
        list.setAdapter(customAdapter);
    }

}
