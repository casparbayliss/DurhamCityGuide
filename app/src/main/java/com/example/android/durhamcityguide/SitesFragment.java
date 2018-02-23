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

public class SitesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.cathedral, "Durham Cathedral", "DH1 3EH"));
        words.add(new Word(R.drawable.castle, "Durham Castle", "DH1 3RW"));
        words.add(new Word(R.drawable.city_centre, "City Centre",
                "Historic market town"));
        words.add(new Word(R.drawable.beamish_museum, "Beamish Museum", "DH9 0RG"));
        words.add(new Word(R.drawable.bowes_museum, "Bowes Museum", "DL12 8NP"));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
