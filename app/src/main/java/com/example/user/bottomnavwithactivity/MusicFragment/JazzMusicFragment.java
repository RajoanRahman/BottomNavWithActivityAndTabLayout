package com.example.user.bottomnavwithactivity.MusicFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.bottomnavwithactivity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JazzMusicFragment extends Fragment {


    public JazzMusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jazz_music, container, false);
    }

}
