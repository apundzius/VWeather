package com.accuweather.algirdas.vweather.Forecast7Day.JsonData;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Algirdas on 2015.09.09.
 */
public class Simpleforecast {

    @Expose
    private List<Forecastday_> forecastday = new ArrayList<Forecastday_>();

    /**
     *
     * @return
     * The forecastday
     */
    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    /**
     *
     * @param forecastday
     * The forecastday
     */
    public void setForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
    }

}