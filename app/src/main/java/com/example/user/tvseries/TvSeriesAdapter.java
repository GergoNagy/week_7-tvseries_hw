package com.example.user.tvseries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TvSeriesAdapter extends ArrayAdapter<TvSeries> {

    public TvSeriesAdapter(Context context, ArrayList<TvSeries> series) {
        super(context, 0, series);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.series_item, parent, false);
        }

        TvSeries currentSeries = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSeries.getTitle());

        TextView season = (TextView) listItemView.findViewById(R.id.season);
        season.setText(currentSeries.getSeason());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentSeries.getYear().toString());

        return listItemView;
    }
}


