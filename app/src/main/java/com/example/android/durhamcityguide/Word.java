package com.example.android.durhamcityguide;

/**
 * Created by Caspar on 23-Jan-18.
 */

public class Word {

    /** Image resource for the location */
    private int mImageResourceId;

    /** Name of the location */
    private String mLocation;

    /** Address of the location */
    private String mAddress;


    /** Create a new Word object
     *
     * @param imageResourceId is the drawable resource for the image associated with the location
     * @param location is the name of the location
     * @param address is the address of the location
     */
    public Word(int imageResourceId, String location, String address) {
        mImageResourceId = imageResourceId;
        mLocation = location;
        mAddress = address;
    }

    /**
     * Get the image resource ID of the word
     */
    public int getImageResourceId(){return mImageResourceId;}

    /**
     * Get the name of the location
     */
    public String getLocation(){return mLocation;}

    /**
     * Get the address of the location
     */
    public String getAddress(){return mAddress;}
}
