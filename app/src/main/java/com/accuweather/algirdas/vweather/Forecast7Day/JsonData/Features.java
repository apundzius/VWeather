package com.accuweather.algirdas.vweather.Forecast7Day.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.08.
 */
public class Features {

    @Expose
    private Integer forecast10day;

    /**
     *
     * @return
     * The forecast10day
     */
    public Integer getForecast10day() {
        return forecast10day;
    }

    /**
     *
     * @param forecast10day
     * The forecast10day
     */
    public void setForecast10day(Integer forecast10day) {
        this.forecast10day = forecast10day;
    }

}