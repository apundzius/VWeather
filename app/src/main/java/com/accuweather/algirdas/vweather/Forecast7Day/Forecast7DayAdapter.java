package com.accuweather.algirdas.vweather.Forecast7Day;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.accuweather.algirdas.vweather.Forecast7Day.JsonData.Forecastday_;
import com.accuweather.algirdas.vweather.R;
import com.accuweather.algirdas.vweather.Utilities;
import com.koushikdutta.ion.Ion;

import java.util.List;

/**
 * Created by Algirdas on 2015.09.09.
 */
public class Forecast7DayAdapter extends ArrayAdapter<Forecastday_> {

    public Forecast7DayAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public Forecast7DayAdapter(Context context, int resource, List<Forecastday_> items) {
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

        Forecastday_ p = getItem(position);

        ImageView weatherIcon = (ImageView) v.findViewById(R.id.imageViewList);
        TextView largeText = (TextView) v.findViewById(R.id.largeTextViewList);
        TextView mediumText = (TextView) v.findViewById(R.id.mediumTextViewList);
        TextView smallText = (TextView) v.findViewById(R.id.smallTextViewList);

        mediumText.setText(p.getDate().getWeekday()+"");
        smallText.setText(p.getConditions());
        largeText.setText(p.getHigh().getCelsius()+ Utilities.celciusSign()+"/"+p.getLow().getCelsius()+Utilities.celciusSign());

        Ion.with(getContext())
                .load(p.getIconUrl())
                .intoImageView(weatherIcon);


        return v;
    }

}