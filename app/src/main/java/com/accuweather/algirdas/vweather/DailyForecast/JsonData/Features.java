package com.accuweather.algirdas.vweather.DailyForecast.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.07.
 */
public class Features {

    @Expose
    private Integer hourly;

    /**
     *
     * @return
     * The hourly
     */
    public Integer getHourly() {
        return hourly;
    }

    /**
     *
     * @param hourly
     * The hourly
     */
    public void setHourly(Integer hourly) {
        this.hourly = hourly;
    }

}
