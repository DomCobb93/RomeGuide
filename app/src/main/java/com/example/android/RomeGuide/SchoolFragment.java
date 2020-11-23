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
public class SchoolFragment extends Fragment {

    public SchoolFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_school, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.school_spizzichino_name), getString(R.string.school_spizzichino_address)));
        tourItems.add(new TourItem(getString(R.string.school_primoLevi_name), getString(R.string.school_primoLevi_address)));
        tourItems.add(new TourItem(getString(R.string.school_spizzichino_name), getString(R.string.school_spizzichino_address)));
        tourItems.add(new TourItem(getString(R.string.school_primoLevi_name), getString(R.string.school_primoLevi_address)));
        tourItems.add(new TourItem(getString(R.string.school_spizzichino_name), getString(R.string.school_spizzichino_address)));
        tourItems.add(new TourItem(getString(R.string.school_primoLevi_name), getString(R.string.school_primoLevi_address)));
        tourItems.add(new TourItem(getString(R.string.school_spizzichino_name), getString(R.string.school_spizzichino_address)));
        tourItems.add(new TourItem(getString(R.string.school_primoLevi_name), getString(R.string.school_primoLevi_address)));
        tourItems.add(new TourItem(getString(R.string.school_spizzichino_name), getString(R.string.school_spizzichino_address)));
        tourItems.add(new TourItem(getString(R.string.school_primoLevi_name), getString(R.string.school_primoLevi_address)));

        ListView listView = (ListView) rootView.findViewById(R.id.school_lv);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
