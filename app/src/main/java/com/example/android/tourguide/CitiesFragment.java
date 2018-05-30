package com.example.android.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CitiesFragment extends Fragment {

    // Required empty public constructor
    public CitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Atractions
        ArrayList<Atraction> atractions = new ArrayList<>();
        atractions.add(new Atraction(getResources().getString(R.string.Sandomierz_description), getResources().getString(R.string.Sandomierz), R.drawable.sandomierz));
        atractions.add(new Atraction(getResources().getString(R.string.Kielce_description), getResources().getString(R.string.Kielce), R.drawable.kielce));
        atractions.add(new Atraction(getResources().getString(R.string.Opatow_description), getResources().getString(R.string.Opatow), R.drawable.opatow));
        atractions.add(new Atraction(getResources().getString(R.string.Kurozweki_description), getResources().getString(R.string.Kurozweki), R.drawable.kurozweki));

        //Create an PlaceAdapter, whose data source is a list of Atractions.
       AttractionAdapter adapter = new AttractionAdapter(getActivity(), atractions);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }






}