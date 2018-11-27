package com.happysanz.happyapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happysanz.happyapp.R;

public class DigitalMarketingFragment extends Fragment {

    private View rootView;


    public static DigitalMarketingFragment newInstance(int position) {
        DigitalMarketingFragment frag = new DigitalMarketingFragment();
        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_digital, container, false);
        return rootView;
    }
}
