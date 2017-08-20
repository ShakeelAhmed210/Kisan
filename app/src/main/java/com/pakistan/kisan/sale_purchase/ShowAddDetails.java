package com.pakistan.kisan.sale_purchase;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pakistan.kisan.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.pakistan.kisan.R.id.mapWebView;


/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class ShowAddDetails extends Fragment implements  View.OnClickListener,OnMapReadyCallback {

    private ScrollView scrollView3;
    private TextView adTitleTxt;
    private HorizontalScrollView horizontalScrollView;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private TextView priceTxt;
    private TextView textView4;
    private TextView descriptionTxt;
    private TextView addressTxt;
    private TextView postedByTxt;
    private TextView websiteTxt;
    //  private WebView mapWebView;
    private TextView textView3;
    private TextView textView5;
    private TextView textView6;
    private TextView textView8;
    private TextView textView7;
    private LinearLayout prevLayout;
    private TextView textView9;
    private ImageView prevImg;
    private GoogleMap mMap;

    SupportMapFragment mapFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_show_add_details, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        scrollView3 = (ScrollView) view.findViewById(R.id.scrollView3);
        adTitleTxt = (TextView) view.findViewById(R.id.adTitleTxt);
        horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.horizontalScrollView);
        image1 = (ImageView) view.findViewById(R.id.image1);
        image2 = (ImageView) view.findViewById(R.id.image2);
        image3 = (ImageView) view.findViewById(R.id.image3);
        priceTxt = (TextView) view.findViewById(R.id.priceTxt);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        descriptionTxt = (TextView) view.findViewById(R.id.descriptionTxt);
        addressTxt = (TextView) view.findViewById(R.id.addressTxt);
        postedByTxt = (TextView) view.findViewById(R.id.postedByTxt);
        websiteTxt = (TextView) view.findViewById(R.id.websiteTxt);
        //  mapWebView = (WebView) view.findViewById(R.id.mapWebView);
        view.findViewById(R.id.openMapsButt).setOnClickListener(this);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        textView5 = (TextView) view.findViewById(R.id.textView5);
        textView6 = (TextView) view.findViewById(R.id.textView6);
        textView8 = (TextView) view.findViewById(R.id.textView8);
        textView7 = (TextView) view.findViewById(R.id.textView7);
        view.findViewById(R.id.sendMessButt).setOnClickListener(this);
        view.findViewById(R.id.makeCallButt).setOnClickListener(this);
        prevLayout = (LinearLayout) view.findViewById(R.id.prevLayout);
        textView9 = (TextView) view.findViewById(R.id.textView9);
        prevImg = (ImageView) view.findViewById(R.id.prevImg);



        mapFragment = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(mapWebView);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.openMapsButt:
                //TODO implement
                break;
            case R.id.sendMessButt:
                //TODO implement
                break;
            case R.id.makeCallButt:
                //TODO implement
                break;
        }
    }

    private EditText getMessageTxt(){
        return (EditText) getView().findViewById(R.id.messageTxt);
    }

    private EditText getNameTxt(){
        return (EditText) getView().findViewById(R.id.nameTxt);
    }

    private EditText getEmailAddTxt(){
        return (EditText) getView().findViewById(R.id.emailAddTxt);
    }

    private EditText getPhoneTxt(){
        return (EditText) getView().findViewById(R.id.phoneTxt);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap=googleMap;

        LatLng maPosition = new LatLng(30.186233, 71.468165);
        MarkerOptions currentPosition = new MarkerOptions().position(maPosition).title("MULTAN").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        CameraPosition current_position = CameraPosition.builder().target(maPosition).zoom(10).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(current_position), 2000, null);
        mMap.addMarker(currentPosition);

    }
}
