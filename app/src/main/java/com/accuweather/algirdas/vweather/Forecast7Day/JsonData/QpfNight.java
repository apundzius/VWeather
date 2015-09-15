package com.accuweather.algirdas.vweather.Forecast7Day.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.09.
 */
public class QpfNight {

    @Expose
    private Double in;
    @Expose
    private Integer mm;

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
     * The mm
     */
    public Integer getMm() {
        return mm;
    }

    /**
     *
     * @param mm
     * The mm
     */
    public void setMm(Integer mm) {
        this.mm = mm;
    }

}