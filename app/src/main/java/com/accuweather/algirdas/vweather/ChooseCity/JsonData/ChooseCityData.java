package com.accuweather.algirdas.vweather.ChooseCity.JsonData;

import com.accuweather.algirdas.vweather.ChooseCity.JsonData.Result;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class ChooseCityData {

    @Expose
    private List<Result> RESULTS = new ArrayList<Result>();

    /**
     *
     * @return
     * The RESULTS
     */
    public List<Result> getRESULTS() {
        return RESULTS;
    }

    /**
     *
     * @param RESULTS
     * The RESULTS
     */
    public void setRESULTS(List<Result> RESULTS) {
        this.RESULTS = RESULTS;
    }

}
