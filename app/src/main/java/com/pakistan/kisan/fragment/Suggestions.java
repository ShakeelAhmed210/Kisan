package com.pakistan.kisan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pakistan.kisan.R;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class Suggestions extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.suggestion_for_crop, container, false);
        return v;
    }
}
