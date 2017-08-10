package com.example.user.tvseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class SeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_list);

        ListOfTheSeries listOfTheSeries = new ListOfTheSeries();
        ArrayList<TvSeries> list = listOfTheSeries.getList();

        TvSeriesAdapter listOfTheSeriesAdapeter = new TvSeriesAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listOfTheSeriesAdapeter);
    }

//    public getSeries(View listItem){
//        TvSeries tvSeries = (takeKeyEvents(TvSeries) listItem.getTag();
//    }
}
