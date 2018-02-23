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

public class ClubsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.klute, "Klute","Infamously bad club."));
        words.add(new Word(R.drawable.loveshack, "Loveshack",
                "Traditionally the sports team club."));
        words.add(new Word(R.drawable.jimmy_allens, "Jimmy Allen's",
                "Small, crowded and cheap."));
        words.add(new Word(R.drawable.fabios, "Fabio's",
                "Small but with good atmosphere and music."));
        words.add(new Word(R.drawable.loft, "Loft",
                "Regular events that normally include after-parties."));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
