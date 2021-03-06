package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CastleFragment extends Fragment {
    // Required empty public constructor
    public CastleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Atractions
        ArrayList<Atraction> atractions = new ArrayList<>();
        atractions.add(new Atraction(getResources().getString(R.string.checiny_description), getResources().getString(R.string.checiny), R.drawable.checiny));
        atractions.add(new Atraction(getResources().getString(R.string.ujazd_description), getResources().getString(R.string.ujazd), R.drawable.krzyztopor));
        atractions.add(new Atraction(getResources().getString(R.string.szydlowiec_description), getResources().getString(R.string.szydlowiec), R.drawable.szydlowiec));
        //Create an PlaceAdapter, whose data source is a list of Atractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), atractions);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the Adapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
