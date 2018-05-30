package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AttractionAdapter extends ArrayAdapter<Atraction> {

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context    is the current context (i.e. Activity) that the adapter
     *                   is being created in.
     * @param atractions is the list of {@link Atraction)  to be displayed.
     */
    public AttractionAdapter(Context context, ArrayList<Atraction> atractions) {
        super(context, 0, atractions);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Atraction} object located at this position in the list
        Atraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);

        // Get the location of the Attraction from the currentAttraction object and set this text on location.
        locationTextView.setText(currentAttraction.getLocation());


        // Find the TextView in the list_item.xml layout with the ID location.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        // Get the description of the Attraction from the currentAttraction object and set this text on description.
        descriptionTextView.setText(currentAttraction.getDescription());

        // Find the TextView in the list_item.xml layout with the ID location.
        ImageView imageViewView = (ImageView) listItemView.findViewById(R.id.image);

        // Get the image of the Attraction from the currentAttraction object.
        imageViewView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;


    }
}
