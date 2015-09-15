package com.accuweather.algirdas.vweather.CurrentForecast;

/**
 * Created by Algirdas on 2015.09.03.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.accuweather.algirdas.vweather.R;
import com.accuweather.algirdas.vweather.Utilities;
import com.accuweather.algirdas.vweather.CurrentForecast.JsonData.CurrentObservation;
import com.accuweather.algirdas.vweather.BaseFragment;
import com.koushikdutta.ion.Ion;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A placeholder fragment containing a simple view.
 */
public class CurrentForecastFragment extends BaseFragment {

    View view;

    @InjectView(R.id.temperatureTextView)
    TextView temperatureTextView;

    @InjectView(R.id.highLowTextView)
    TextView highlowTextView;

    @InjectView(R.id.summaryTitleTextView)
    TextView summaryTitleTextView;

    @InjectView(R.id.cityNametextView)
    TextView cityNametextView;

    @InjectView(R.id.summaryTextView)
    TextView summaryTextView;

    @InjectView(R.id.weatherImage)
    ImageView weatherIcon;


    public static CurrentForecastFragment newInstance() {
        CurrentForecastFragment fragment = new CurrentForecastFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public CurrentForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    public void initDesign()
    {
            Ion.with(this.getActivity())
                    .load(dataProvider.getCurrentData().getCurrentObservation().getIconUrl())
                   .intoImageView(weatherIcon);


            CurrentObservation data = dataProvider.getCurrentData().getCurrentObservation();

            cityNametextView.setText(data.getDisplayLocation().getCity());
            temperatureTextView.setText(data.getFeelslikeC() + Utilities.celciusSign());
            highlowTextView.setText("H: " + data.getTempC() + Utilities.celciusSign() + " / L: " +data.getDewpointC() + Utilities.celciusSign());

            summaryTitleTextView.setText(data.getWeather());
            summaryTextView.setText(getString(R.string.RealFeel) + ": " + data.getFeelslikeC() + "\n" +
                                    getString(R.string.Humidity) + ": " + data.getRelativeHumidity() + "\n" +
                                    getString(R.string.Winds) + ": " + data.getWindKph() + "\n" +
                                    getString(R.string.Visibility) + ": " + data.getVisibilityKm() + "\n" +
                                    getString(R.string.Sunrise) + ": " + "no data" + "\n" +
                                    getString(R.string.Sunset) + ": " + "no data" + "\n"
            );
    }

}