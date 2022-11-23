package com.example.myproject.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myproject.Adapter.BreadLocationAdapter;
import com.example.myproject.Domain.BreadLocation;
import com.example.myproject.R;

import java.util.ArrayList;
import java.util.List;


public class ReciptFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private ViewPager2 breadViewpager;
    private List<BreadLocation> breadLocations;


    public ReciptFragment() {

    }

    public static ReciptFragment newInstance(String param1, String param2) {
        ReciptFragment fragment = new ReciptFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.receipt, container, false);

        breadViewpager = view.findViewById(R.id.bread_viewpager);
        breadLocations = new ArrayList<>();

        // date input
        BreadLocation breadLocation1 = new BreadLocation();
        breadLocation1.imageUrl = "https://cdn.pixabay.com/photo/2013/04/07/21/30/bread-101636_1280.jpg";
        breadLocation1.title = "Special Bread";
        breadLocation1.location = "Seoul";
        breadLocation1.starRating = 4.3f;
        breadLocations.add(breadLocation1);

        BreadLocation breadLocation2 = new BreadLocation();
        breadLocation2.imageUrl = "https://img1.daumcdn.net/thumb/R1280x0.fjpg/?fname=http://t1.daumcdn.net/brunch/service/user/3fuW/image/63Bw7FH2vx8GjKnFYV5mKmN0RRM";
        breadLocation2.title = "Common Bread";
        breadLocation2.location = "Seoul";
        breadLocation2.starRating = 4.2f;
        breadLocations.add(breadLocation2);

        BreadLocation breadLocation3 = new BreadLocation();
        breadLocation3.imageUrl = "https://img1.daumcdn.net/thumb/R1280x0.fjpg/?fname=http://t1.daumcdn.net/brunch/service/user/3fuW/image/nLnQtDmn-lomrfL-feeXDt_3Tq4";
        breadLocation3.title = "Delicious Bread";
        breadLocation3.location = "Seoul";
        breadLocation3.starRating = 4.1f;
        breadLocations.add(breadLocation3);

        BreadLocation breadLocation4 = new BreadLocation();
        breadLocation4.imageUrl = "https://images-ext-2.discordapp.net/external/g3s1zl0yg0zzlJlbUM7cFwSoBj6eWC3rKXi4S0yVKmk/https/image.edaily.co.kr/images/photo/files/NP/S/2021/06/PS21060300614.jpg";
        breadLocation4.title = "Mint Bread";
        breadLocation4.location = "Seoul";
        breadLocation4.starRating = 2.8f;
        breadLocations.add(breadLocation4);





        // connet adapter
        breadViewpager.setAdapter(new BreadLocationAdapter(breadLocations));
        breadViewpager.setClipToPadding(false);
        breadViewpager.setClipChildren(false);
        breadViewpager.setOffscreenPageLimit(3);
        breadViewpager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        // viewpager move design
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.95f + r * 0.05f);
            }
        });

        breadViewpager.setPageTransformer(compositePageTransformer);

        return view;
    }

}