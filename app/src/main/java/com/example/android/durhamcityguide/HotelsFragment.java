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

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.marriott, "JW Marriott",
                "DH1 3JN"));
        words.add(new Word(R.drawable.radisson, "Radisson Blu",
                "DH1 5TA"));
        words.add(new Word(R.drawable.lumley_castle, "Lumley Castle",
                "DH3 4NX"));
        words.add(new Word(R.drawable.hardwick_hall, "Hardwick Hall",
                "TS21 2EH"));
        words.add(new Word(R.drawable.lumley_castle, "Ramside Hall",
                "DH1 1TD"));
        words.add(new Word(R.drawable.beamish_hall, "Beamish Hall", "DH9 0YB"));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
