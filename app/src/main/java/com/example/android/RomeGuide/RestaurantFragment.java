package com.example.android.RomeGuide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.rest_girasole_name), getString(R.string.rest_girasole_address)));
        tourItems.add(new TourItem(getString(R.string.rest_tonnarello_name), getString(R.string.rest_tonnarello_address)));
        tourItems.add(new TourItem(getString(R.string.rest_pergola_name), getString(R.string.rest_pergola_address)));
        tourItems.add(new TourItem(getString(R.string.rest_girasole_name), getString(R.string.rest_girasole_address)));
        tourItems.add(new TourItem(getString(R.string.rest_tonnarello_name), getString(R.string.rest_tonnarello_address)));
        tourItems.add(new TourItem(getString(R.string.rest_pergola_name), getString(R.string.rest_pergola_address)));
        tourItems.add(new TourItem(getString(R.string.rest_girasole_name), getString(R.string.rest_girasole_address)));
        tourItems.add(new TourItem(getString(R.string.rest_tonnarello_name), getString(R.string.rest_tonnarello_address)));
        tourItems.add(new TourItem(getString(R.string.rest_pergola_name), getString(R.string.rest_pergola_address)));
        tourItems.add(new TourItem(getString(R.string.rest_girasole_name), getString(R.string.rest_girasole_address)));
        tourItems.add(new TourItem(getString(R.string.rest_tonnarello_name), getString(R.string.rest_tonnarello_address)));
        tourItems.add(new TourItem(getString(R.string.rest_pergola_name), getString(R.string.rest_pergola_address)));

        ListView listView = (ListView) rootView.findViewById(R.id.rest_lv);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
