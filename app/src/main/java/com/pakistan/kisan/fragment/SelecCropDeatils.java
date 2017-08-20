package com.pakistan.kisan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.pakistan.kisan.R;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class SelecCropDeatils extends Fragment implements View.OnClickListener {

    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.select_crop_details, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView12 = (TextView) view.findViewById(R.id.textView12);
        textView13 = (TextView) view.findViewById(R.id.textView13);
        textView14 = (TextView) view.findViewById(R.id.textView14);
        textView15 = (TextView) view.findViewById(R.id.textView15);
        view.findViewById(R.id.select_from_map).setOnClickListener(this);
    }

    private EditText getAcFullnameTxt(){
        return (EditText) getView().findViewById(R.id.acFullnameTxt);
    }

    private EditText getAcEmailTxt(){
        return (EditText) getView().findViewById(R.id.acEmailTxt);
    }

    private EditText getAcPhoneTxt(){
        return (EditText) getView().findViewById(R.id.acPhoneTxt);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.select_from_map:
                //TODO implement
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
                break;
        }
    }
}
