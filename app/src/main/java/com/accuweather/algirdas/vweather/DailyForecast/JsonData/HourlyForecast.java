package com.accuweather.algirdas.vweather.DailyForecast.JsonData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Algirdas on 2015.09.07.
 */
public class HourlyForecast {

    @Expose
    private FCTTime FCTTIME;
    @Expose
    private Temp temp;
    @Expose
    private Dewpoint dewpoint;
    @Expose
    private String condition;
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @Expose
    private String fctcode;
    @Expose
    private String sky;
    @Expose
    private Wspd wspd;
    @Expose
    private Wdir wdir;
    @Expose
    private String wx;
    @Expose
    private String uvi;
    @Expose
    private String humidity;
    @Expose
    private Windchill windchill;
    @Expose
    private Heatindex heatindex;
    @Expose
    private Feelslike feelslike;
    @Expose
    private Qpf qpf;
    @Expose
    private Snow snow;
    @Expose
    private String pop;
    @Expose
    private Mslp mslp;

    /**
     *
     * @return
     * The FCTTIME
     */
    public FCTTime getFCTTIME() {
        return FCTTIME;
    }

    /**
     *
     * @param FCTTIME
     * The FCTTIME
     */
    public void setFCTTIME(FCTTime FCTTIME) {
        this.FCTTIME = FCTTIME;
    }

    /**
     *
     * @return
     * The temp
     */
    public Temp getTemp() {
        return temp;
    }

    /**
     *
     * @param temp
     * The temp
     */
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    /**
     *
     * @return
     * The dewpoint
     */
    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    /**
     *
     * @param dewpoint
     * The dewpoint
     */
    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    /**
     *
     * @return
     * The condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     *
     * @param condition
     * The condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     *
     * @return
     * The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     *
     * @param iconUrl
     * The icon_url
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     *
     * @return
     * The fctcode
     */
    public String getFctcode() {
        return fctcode;
    }

    /**
     *
     * @param fctcode
     * The fctcode
     */
    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    /**
     *
     * @return
     * The sky
     */
    public String getSky() {
        return sky;
    }

    /**
     *
     * @param sky
     * The sky
     */
    public void setSky(String sky) {
        this.sky = sky;
    }

    /**
     *
     * @return
     * The wspd
     */
    public Wspd getWspd() {
        return wspd;
    }

    /**
     *
     * @param wspd
     * The wspd
     */
    public void setWspd(Wspd wspd) {
        this.wspd = wspd;
    }

    /**
     *
     * @return
     * The wdir
     */
    public Wdir getWdir() {
        return wdir;
    }

    /**
     *
     * @param wdir
     * The wdir
     */
    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    /**
     *
     * @return
     * The wx
     */
    public String getWx() {
        return wx;
    }

    /**
     *
     * @param wx
     * The wx
     */
    public void setWx(String wx) {
        this.wx = wx;
    }

    /**
     *
     * @return
     * The uvi
     */
    public String getUvi() {
        return uvi;
    }

    /**
     *
     * @param uvi
     * The uvi
     */
    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    /**
     *
     * @return
     * The humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     *
     * @param humidity
     * The humidity
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     *
     * @return
     * The windchill
     */
    public Windchill getWindchill() {
        return windchill;
    }

    /**
     *
     * @param windchill
     * The windchill
     */
    public void setWindchill(Windchill windchill) {
        this.windchill = windchill;
    }

    /**
     *
     * @return
     * The heatindex
     */
    public Heatindex getHeatindex() {
        return heatindex;
    }

    /**
     *
     * @param heatindex
     * The heatindex
     */
    public void setHeatindex(Heatindex heatindex) {
        this.heatindex = heatindex;
    }

    /**
     *
     * @return
     * The feelslike
     */
    public Feelslike getFeelslike() {
        return feelslike;
    }

    /**
     *
     * @param feelslike
     * The feelslike
     */
    public void setFeelslike(Feelslike feelslike) {
        this.feelslike = feelslike;
    }

    /**
     *
     * @return
     * The qpf
     */
    public Qpf getQpf() {
        return qpf;
    }

    /**
     *
     * @param qpf
     * The qpf
     */
    public void setQpf(Qpf qpf) {
        this.qpf = qpf;
    }

    /**
     *
     * @return
     * The snow
     */
    public Snow getSnow() {
        return snow;
    }

    /**
     *
     * @param snow
     * The snow
     */
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    /**
     *
     * @return
     * The pop
     */
    public String getPop() {
        return pop;
    }

    /**
     *
     * @param pop
     * The pop
     */
    public void setPop(String pop) {
        this.pop = pop;
    }

    /**
     *
     * @return
     * The mslp
     */
    public Mslp getMslp() {
        return mslp;
    }

    /**
     *
     * @param mslp
     * The mslp
     */
    public void setMslp(Mslp mslp) {
        this.mslp = mslp;
    }

}
