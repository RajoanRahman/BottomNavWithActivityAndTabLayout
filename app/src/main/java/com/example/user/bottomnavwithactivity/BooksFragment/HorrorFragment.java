package com.example.user.bottomnavwithactivity.BooksFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.bottomnavwithactivity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HorrorFragment extends Fragment {


    public HorrorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.horror,container,false);
        return view;
    }

}
