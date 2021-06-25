package com.example.hehe.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.hehe.R;
import com.example.hehe.VS.VSViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class VSFragment extends Fragment {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private View mView;



    public VSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       mView = inflater.inflate(R.layout.fragment_vs, container, false);

        tabLayout = mView.findViewById(R.id.tab_layout_vs);
        viewPager = mView.findViewById(R.id.vs_viewpager);

        VSViewPagerAdapter adapter = new VSViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);


        return mView;
    }
}