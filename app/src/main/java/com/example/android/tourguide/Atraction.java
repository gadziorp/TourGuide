package com.example.android.tourguide;

public class Atraction {
    /**
     * String resource ID for location
     */
    private String mLocation;

    /**
     * String resource ID for the description
     */
    private String mDescription;


    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;


    /**
     * Create a constructor.
     *
     * @param description     is the short description.
     * @param location        is the attraction location.
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction.
     */
    public Atraction(String description, String location, int imageResourceId) {
        mDescription = description;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string for the description.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the string for location..
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}



