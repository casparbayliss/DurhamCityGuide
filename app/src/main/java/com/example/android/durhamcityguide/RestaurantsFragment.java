package com.example.android.durhamcityguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.flat_white, "Flat white",
                "DH1 3JN"));
        words.add(new Word(R.drawable.capriccio, "Capriccio's",
                "Family-run Italian."));
        words.add(new Word(R.drawable.spaghettata, "La Spaghettata",
                "Cheap Italian."));
        words.add(new Word(R.drawable.dh1, "DH1",
                "One of the best restaurants in the North-East."));
        words.add(new Word(R.drawable.lebaneat, "Lebaneat",
                "Lebanese cuisine."));
        words.add(new Word(R.drawable.zen, "Zen", "Asian Cuisine."));
        words.add(new Word(R.drawable.finbarrs, "Finbarr's", "General cuisine."));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.colorPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
