package com.accuweather.algirdas.vweather.Forecast7Day.JsonData;

import com.google.gson.annotations.Expose;

public class Forecast7Day {

    @Expose
    private Response response;
    @Expose
    private Forecast forecast;

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
     * The forecast
     */
    public Forecast getForecast() {
        return forecast;
    }

    /**
     *
     * @param forecast
     * The forecast
     */
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}











