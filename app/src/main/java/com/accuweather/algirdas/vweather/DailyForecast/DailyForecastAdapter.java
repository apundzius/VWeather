package com.accuweather.algirdas.vweather.DailyForecast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.accuweather.algirdas.vweather.DailyForecast.JsonData.HourlyForecast;
import com.accuweather.algirdas.vweather.R;
import com.accuweather.algirdas.vweather.Utilities;
import com.koushikdutta.ion.Ion;

import java.util.List;

/**
 * Created by Algirdas on 2015.09.07.
 */
public class DailyForecastAdapter extends ArrayAdapter<HourlyForecast> {

    public DailyForecastAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public DailyForecastAdapter(Context context, int resource, List<HourlyForecast> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.hourly_row, null);
        }

        HourlyForecast p = getItem(position);

        ImageView weatherIcon = (ImageView) v.findViewById(R.id.imageViewList);
        TextView largeText = (TextView) v.findViewById(R.id.largeTextViewList);
        TextView mediumText = (TextView) v.findViewById(R.id.mediumTextViewList);
        TextView smallText = (TextView) v.findViewById(R.id.smallTextViewList);

        mediumText.setText(p.getFCTTIME().getHourPadded()+":"+p.getFCTTIME().getMin());
        smallText.setText(p.getCondition());
        largeText.setText(p.getFeelslike().getMetric()+ Utilities.celciusSign());

        Ion.with(getContext())
                .load(p.getIconUrl())
                .intoImageView(weatherIcon);
        return v;
    }

}