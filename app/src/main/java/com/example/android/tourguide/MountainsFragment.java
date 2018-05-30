package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MountainsFragment extends Fragment {
    // Required empty public constructor
    public MountainsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Atractions
        ArrayList<Atraction> atractions = new ArrayList<>();
        atractions.add(new Atraction(getResources().getString(R.string.lysa_description), getResources().getString(R.string.lysa_location), R.drawable.lysa_gora));
        atractions.add(new Atraction(getResources().getString(R.string.lysica_description), getResources().getString(R.string.lysica_location), R.drawable.lysica));
        atractions.add(new Atraction(getResources().getString(R.string.telegraf_description), getResources().getString(R.string.telegraf_location), R.drawable.telegraf));

        //Create an PlaceAdapter, whose data source is a list of Atractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), atractions);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
