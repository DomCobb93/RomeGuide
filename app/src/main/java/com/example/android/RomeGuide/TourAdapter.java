package com.example.android.RomeGuide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


public class TourAdapter extends ArrayAdapter<TourItem> {

    TourAdapter(Context context, ArrayList<TourItem> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TourItem tourItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageview_lv);
        TextView titleTextView = convertView.findViewById(R.id.title_textview_lv);
        TextView locTextView = convertView.findViewById(R.id.loc_textview_lv);

        imageView.setImageResource(tourItem.getImage());
        titleTextView.setText(tourItem.getTitle());
        locTextView.setText(tourItem.getLocation());

        return convertView;
    }
}
