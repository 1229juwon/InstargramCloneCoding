package com.example.myproject.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myproject.fragment.ProfileViewPagerFirstFragment;
import com.example.myproject.fragment.ProfileViewPagerSecFragment;

    public class ProfileViewPagerAdapter extends FragmentStateAdapter {

    private Context context;
    int totalTabs;
    Lifecycle lifecycle;

    public ProfileViewPagerAdapter(@NonNull FragmentManager fm, Lifecycle lifecycle, Context context, int totalTabs) {
        super(fm, lifecycle);
        this.context = context;
        this.totalTabs = totalTabs;
    }





        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    ProfileViewPagerFirstFragment profileViewPagerFirstFragment = new ProfileViewPagerFirstFragment();
                    return profileViewPagerFirstFragment;
                case 1:
                    ProfileViewPagerSecFragment profileViewPagerSecFragment = new ProfileViewPagerSecFragment();
                    return profileViewPagerSecFragment;
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return totalTabs;
        }
    }
