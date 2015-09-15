package com.accuweather.algirdas.vweather;

/**
 * Created by Algirdas on 2015.09.07.
 */
public class Constants {
    public static String DEV_KEY = "dca03a2e7bd2d07d";

    public static String CURRENT_STATUS_URL(String city)
    {
        return "http://api.wunderground.com/api/"+ Constants.DEV_KEY + "/conditions/" + city + ".json";
    }

    public static String HOURLY_STATUS_URL(String city)
    {
        return "http://api.wunderground.com/api/"+ Constants.DEV_KEY + "/hourly/" + city + ".json";
    }

    public static String FORECAST_10DAY_URL(String city)
    {
        return "http://api.wunderground.com/api/"+ Constants.DEV_KEY + "/forecast10day/" + city + ".json";
    }


    public static String LOOK_UP_FOR_CITY(String city) {
       return "http://autocomplete.wunderground.com/aq?query="+city;
    }

    public static String VILNIUS_ZMW()
    {
        return "/q/zmw:00000.1.26730";
    }
}
