package com.example.android.durhamcityguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Caspar on 23-Jan-18.
 */

public class BarsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.ebony, "Ebony Champagne Bar",
                "Best cocktails in Durham."));
        words.add(new Word(R.drawable.whiskey_river, "Whiskey River",
                "Good cocktails."));
        words.add(new Word(R.drawable.bar_thirty_three, "Bar 33",
                "Small speakeasy that requires a doorcode."));
        words.add(new Word(R.drawable.boathouse, "Boathouse",
                "Lively bar with cheap drinks and good outside seating."));
        words.add(new Word(R.drawable.court_inn, "Court Inn",
                "Gin speciality bar, with over 140 gins."));
        words.add(new Word(R.drawable.library, "The Libary", "Sports bar."));
        words.add(new Word(R.drawable.swan_and_three, "Swan and Three Cygnets",
                "Very cheap pub."));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
