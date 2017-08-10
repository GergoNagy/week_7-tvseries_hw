package com.example.user.tvseries;

/**
 * Created by user on 09/08/2017.
 */

public class TvSeries {
    private String title;
    private String season;
    private int year;

    public TvSeries(String title, String season, int year){
        this.title = title;
        this.season = season;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getSeason() {
        return season;
    }

    public Integer getYear() {
        return year;
    }
}
