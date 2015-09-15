package com.accuweather.algirdas.vweather.DailyForecast.JsonData;

import com.accuweather.algirdas.vweather.CurrentForecast.JsonData.Response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class HourlyHistory {

    @Expose
    private Response response;
    @SerializedName("hourly_forecast")
    @Expose
    private List<HourlyForecast> hourlyForecast = new ArrayList<HourlyForecast>();

    /**
     *
     * @return
     * The response
     */
    public Response getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     *
     * @return
     * The hourlyForecast
     */
    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    /**
     *
     * @param hourlyForecast
     * The hourly_forecast
     */
    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }

}










