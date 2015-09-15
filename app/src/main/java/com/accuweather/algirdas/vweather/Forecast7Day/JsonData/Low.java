package com.accuweather.algirdas.vweather.Forecast7Day.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.09.
 */
public class Low {

    @Expose
    private String fahrenheit;
    @Expose
    private String celsius;

    /**
     *
     * @return
     * The fahrenheit
     */
    public String getFahrenheit() {
        return fahrenheit;
    }

    /**
     *
     * @param fahrenheit
     * The fahrenheit
     */
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /**
     *
     * @return
     * The celsius
     */
    public String getCelsius() {
        return celsius;
    }

    /**
     *
     * @param celsius
     * The celsius
     */
    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

}