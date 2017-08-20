package com.pakistan.kisan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.pakistan.kisan.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class Account extends Fragment implements View.OnClickListener {
    private CircleImageView avatarImage;
    private TextView textView11;
    private TextView acUsernameTxt;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_account_screen, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        avatarImage = (CircleImageView) view.findViewById(R.id.avatarImage);
        textView11 = (TextView) view.findViewById(R.id.textView11);
        acUsernameTxt = (TextView) view.findViewById(R.id.acUsernameTxt);
        textView12 = (TextView) view.findViewById(R.id.textView12);
        textView13 = (TextView) view.findViewById(R.id.textView13);
        textView14 = (TextView) view.findViewById(R.id.textView14);
        textView15 = (TextView) view.findViewById(R.id.textView15);
        view.findViewById(R.id.saveProfileButt).setOnClickListener(this);
        view.findViewById(R.id.myAdsButt).setOnClickListener(this);
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

    private EditText getAcWebsiteTxt(){
        return (EditText) getView().findViewById(R.id.acWebsiteTxt);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.saveProfileButt:
                //TODO implement
                break;
            case R.id.myAdsButt:
                //TODO implement
                break;
        }
    }
}
