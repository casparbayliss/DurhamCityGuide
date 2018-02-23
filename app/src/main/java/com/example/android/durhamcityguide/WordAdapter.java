package com.example.android.durhamcityguide;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Caspar on 23-Jan-18.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list

        Word currentWord = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //Set the provided image based upon the resource ID
        imageView.setImageResource(currentWord.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID location_text_view
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the location name from the currentWord object and set this text on the Location
        // TextView
        locationTextView.setText(currentWord.getLocation());

        // Find the TextView in the list_item.xml layout with the ID address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address name from the currentWord object and set this text on the Address
        // TextView
        addressTextView.setText(currentWord.getAddress());

        return listItemView;
    }


}
