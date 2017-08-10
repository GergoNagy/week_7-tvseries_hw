package com.example.user.tvseries;

import java.util.ArrayList;

/**
 * Created by user on 09/08/2017.
 */

public class ListOfTheSeries {

    private ArrayList<TvSeries> list;

    public ListOfTheSeries(){
        list = new ArrayList<TvSeries>();
        list.add(new TvSeries("Supernatural", "13 season", 2005));
        list.add(new TvSeries("egy", "8 season", 2011));
        list.add(new TvSeries("ketto", "8 season", 2011));
        list.add(new TvSeries("harom", "8 season", 2011));
        list.add(new TvSeries("negy", "8 season", 2011));
        list.add(new TvSeries("ot", "8 season", 2011));
        list.add(new TvSeries("hat", "8 season", 2011));
        list.add(new TvSeries("het", "8 season", 2011));
        list.add(new TvSeries("nyolc", "8 season", 2011));
        list.add(new TvSeries("kilenc", "8 season", 2011));
        list.add(new TvSeries("tiz", "8 season", 2011));
        list.add(new TvSeries("alma", "8 season", 2011));
        list.add(new TvSeries("korte", "8 season", 2011));
        list.add(new TvSeries("barack", "8 season", 2011));
        list.add(new TvSeries("banan", "8 season", 2011));
        list.add(new TvSeries("eper", "8 season", 2011));
        list.add(new TvSeries("jeg", "8 season", 2011));
        list.add(new TvSeries("nap", "8 season", 2011));
        list.add(new TvSeries("haz", "8 season", 2011));
        list.add(new TvSeries("magyar", "8 season", 2011));
        list.add(new TvSeries("gulyas", "8 season", 2011));
        list.add(new TvSeries("a", "8 season", 2011));
        list.add(new TvSeries("leg", "8 season", 2011));
        list.add(new TvSeries("jobb", "8 season", 2011));
    }

    public ArrayList<TvSeries>getList() {
        return new ArrayList<TvSeries>(list);
    }

}
