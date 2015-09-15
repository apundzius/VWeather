package com.accuweather.algirdas.vweather.Forecast7Day;

/**
 * Created by Algirdas on 2015.09.09.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.accuweather.algirdas.vweather.R;

import com.accuweather.algirdas.vweather.BaseFragment;
import com.accuweather.algirdas.vweather.Forecast7Day.JsonData.Forecast7Day;

/**
 * Created by Algirdas on 2015.09.03.
 */
public class Forecast7DayFragment extends BaseFragment {

    View view;

    public static Forecast7DayFragment newInstance() {
        Forecast7DayFragment fragment = new Forecast7DayFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public Forecast7DayFragment() {
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
        Forecast7Day data = dataProvider.getForecast10Day();

        ListView list = (ListView) view.findViewById(R.id.listView);

        Forecast7DayAdapter customAdapter = new Forecast7DayAdapter(this.getActivity().getApplicationContext(), R.layout.hourly_row, data.getForecast().getSimpleforecast().getForecastday().subList(0,7));
        list.setAdapter(customAdapter);
    }
}

