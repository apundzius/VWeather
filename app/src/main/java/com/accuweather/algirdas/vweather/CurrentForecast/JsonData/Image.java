package com.accuweather.algirdas.vweather.CurrentForecast.JsonData;

import com.google.gson.annotations.Expose;

/**
 * Created by Algirdas on 2015.09.01.
 */
public class Image {

    @Expose
    private String url;
    @Expose
    private String title;
    @Expose
    private String link;

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

}
