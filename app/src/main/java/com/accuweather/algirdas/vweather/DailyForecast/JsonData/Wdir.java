package com.accuweather.algirdas.vweather.DailyForecast.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.07.
 */
public class Wdir {

    @Expose
    private String dir;
    @Expose
    private String degrees;

    /**
     *
     * @return
     * The dir
     */
    public String getDir() {
        return dir;
    }

    /**
     *
     * @param dir
     * The dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     *
     * @return
     * The degrees
     */
    public String getDegrees() {
        return degrees;
    }

    /**
     *
     * @param degrees
     * The degrees
     */
    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

}