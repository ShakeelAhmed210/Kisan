package com.pakistan.kisan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.pakistan.kisan.MainActivity;
import com.pakistan.kisan.R;
import com.pakistan.kisan.adapters.CropsGridAdapter;
import com.pakistan.kisan.sale_purchase.ShowAddDetails;


/**
 * Created by Shakeel Ahmed on 8/19/2017.
 */

public class SubCategory extends Fragment {
    GridView categoryGrid;
    String[] categoryList;
    int[] images =  {R.drawable.fruits,R.drawable.vegetables,R.drawable.flowers,R.drawable.seeds};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.category_fragment, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle saved) {
        super.onActivityCreated(saved);
        categoryList = getResources().getStringArray(R.array.sub_category_type);
        categoryGrid = (GridView) getActivity().findViewById(R.id.category_type_grid);
      CropsGridAdapter cropsGridAdapter = new CropsGridAdapter(getActivity(), categoryList, images);
        categoryGrid.setAdapter(cropsGridAdapter);
        categoryGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((MainActivity) getActivity()).replaceFragment("Details", new SelecCropDeatils(), null);
            }
        });
    }
}
