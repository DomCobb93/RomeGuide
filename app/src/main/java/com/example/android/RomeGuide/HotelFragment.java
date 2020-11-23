package com.example.android.RomeGuide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.hotel_sheraton_name), getString(R.string.hotel_sheraton_address), R.drawable.sheraton));
        tourItems.add(new TourItem(getString(R.string.hotel_plaza_name), getString(R.string.hotel_plaza_address), R.drawable.plaza));
        tourItems.add(new TourItem(getString(R.string.hotel_naiadi_name), getString(R.string.hotel_naiadi_address), R.drawable.naiadi));
        tourItems.add(new TourItem(getString(R.string.hotel_sheraton_name), getString(R.string.hotel_sheraton_address), R.drawable.sheraton));
        tourItems.add(new TourItem(getString(R.string.hotel_plaza_name), getString(R.string.hotel_plaza_address), R.drawable.plaza));
        tourItems.add(new TourItem(getString(R.string.hotel_naiadi_name), getString(R.string.hotel_naiadi_address), R.drawable.naiadi));
        tourItems.add(new TourItem(getString(R.string.hotel_sheraton_name), getString(R.string.hotel_sheraton_address), R.drawable.sheraton));
        tourItems.add(new TourItem(getString(R.string.hotel_plaza_name), getString(R.string.hotel_plaza_address), R.drawable.plaza));
        tourItems.add(new TourItem(getString(R.string.hotel_naiadi_name), getString(R.string.hotel_naiadi_address), R.drawable.naiadi));
        tourItems.add(new TourItem(getString(R.string.hotel_sheraton_name), getString(R.string.hotel_sheraton_address), R.drawable.sheraton));
        tourItems.add(new TourItem(getString(R.string.hotel_plaza_name), getString(R.string.hotel_plaza_address), R.drawable.plaza));
        tourItems.add(new TourItem(getString(R.string.hotel_naiadi_name), getString(R.string.hotel_naiadi_address), R.drawable.naiadi));
        tourItems.add(new TourItem(getString(R.string.hotel_sheraton_name), getString(R.string.hotel_sheraton_address), R.drawable.sheraton));
        tourItems.add(new TourItem(getString(R.string.hotel_plaza_name), getString(R.string.hotel_plaza_address), R.drawable.plaza));
        tourItems.add(new TourItem(getString(R.string.hotel_naiadi_name), getString(R.string.hotel_naiadi_address), R.drawable.naiadi));


        ListView listView = (ListView) rootView.findViewById(R.id.hotel_lv);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
