package com.accuweather.algirdas.vweather.CurrentForecast.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.01.
 */
public class Features {

    @Expose
    private Integer conditions;

    /**
     *
     * @return
     * The conditions
     */
    public Integer getConditions() {
        return conditions;
    }

    /**
     *
     * @param conditions
     * The conditions
     */
    public void setConditions(Integer conditions) {
        this.conditions = conditions;
    }

}

