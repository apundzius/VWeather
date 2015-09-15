package com.accuweather.algirdas.vweather.Forecast7Day.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.09.
 */

public class SnowAllday {

    @Expose
    private Double in;
    @Expose
    private Double cm;

    /**
     *
     * @return
     * The in
     */
    public Double getIn() {
        return in;
    }

    /**
     *
     * @param in
     * The in
     */
    public void setIn(Double in) {
        this.in = in;
    }

    /**
     *
     * @return
     * The cm
     */
    public Double getCm() {
        return cm;
    }

    /**
     *
     * @param cm
     * The cm
     */
    public void setCm(Double cm) {
        this.cm = cm;
    }

}