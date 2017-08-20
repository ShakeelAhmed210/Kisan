package com.pakistan.kisan.sale_purchase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pakistan.kisan.MainActivity;
import com.pakistan.kisan.R;
import com.pakistan.kisan.fragment.SubCategory;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class BuyItemsSubCategory extends Fragment {

    private ImageView adImage;
    private TextView adTitleTxt;
    private TextView adDescTxt;
    private ImageView adImage1;
    private TextView adTitleTxt1;
    private TextView adDescTxt1;
    RelativeLayout add1,add2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_browse_ad, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adImage = (ImageView) view.findViewById(R.id.adImage);
        adTitleTxt = (TextView) view.findViewById(R.id.adTitleTxt);
        adDescTxt = (TextView) view.findViewById(R.id.adDescTxt);
        adImage1 = (ImageView) view.findViewById(R.id.adImage1);
        adTitleTxt1 = (TextView) view.findViewById(R.id.adTitleTxt1);
        adDescTxt1 = (TextView) view.findViewById(R.id.adDescTxt1);
        add1 = (RelativeLayout) view.findViewById(R.id.add_1);
        add2 = (RelativeLayout) view.findViewById(R.id.add_2);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).replaceFragment("Crops", new ShowAddDetails(), null);
            }
        });
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).replaceFragment("Crops", new ShowAddDetails(), null);
            }
        });
    }

}

