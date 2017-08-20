package com.pakistan.kisan.sale_purchase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.pakistan.kisan.R;
import com.pakistan.kisan.fragment.MapsActivity;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class SellItems extends Fragment implements View.OnClickListener {

    private ScrollView scrollView4;
    private TextView textView17;
    private TextView textView18;
    private Spinner spinner1;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private LinearLayout linearLayout;
    private ImageView pImg1;
    private ImageView pImg2;
    private ImageView pImg3;
    private TextView textView23;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_post_ad, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        scrollView4 = (ScrollView) view.findViewById(R.id.scrollView4);
        textView17 = (TextView) view.findViewById(R.id.textView17);
        textView18 = (TextView) view.findViewById(R.id.textView18);
        spinner1 = (Spinner) view.findViewById(R.id.spinner1);
        textView19 = (TextView) view.findViewById(R.id.textView19);
        textView20 = (TextView) view.findViewById(R.id.textView20);
        textView21 = (TextView) view.findViewById(R.id.textView21);
        view.findViewById(R.id.pLocationButt).setOnClickListener(this);
        textView22 = (TextView) view.findViewById(R.id.textView22);
        linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);
        pImg1 = (ImageView) view.findViewById(R.id.pImg1);
        pImg2 = (ImageView) view.findViewById(R.id.pImg2);
        pImg3 = (ImageView) view.findViewById(R.id.pImg3);
        view.findViewById(R.id.pPostUpdateAdButt).setOnClickListener(this);
        view.findViewById(R.id.pDeleteAdButt).setOnClickListener(this);
        textView23 = (TextView) view.findViewById(R.id.textView23);
    }

    private EditText getPTitleTxt() {
        return (EditText) getView().findViewById(R.id.pTitleTxt);
    }

    private EditText getPPriceTxt() {
        return (EditText) getView().findViewById(R.id.pPriceTxt);
    }

    private EditText getPDescriptionTxt() {
        return (EditText) getView().findViewById(R.id.pDescriptionTxt);
    }

    private EditText getPAddressTxt() {
        return (EditText) getView().findViewById(R.id.pAddressTxt);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pLocationButt:
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
                //TODO implement
                break;
            case R.id.pPostUpdateAdButt:
                //TODO implement
                break;
            case R.id.pDeleteAdButt:
                //TODO implement
                break;
        }
    }
}
