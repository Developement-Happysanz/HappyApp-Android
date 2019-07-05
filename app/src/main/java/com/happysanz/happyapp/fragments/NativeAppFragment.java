package com.happysanz.happyapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happysanz.happyapp.R;
import com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton;

public class NativeAppFragment extends Fragment {

    private View rootView;

    public static NativeAppFragment newInstance(int position) {
        NativeAppFragment frag = new NativeAppFragment();
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

        rootView = inflater.inflate(R.layout.fragment_native_app, container, false);

        return rootView;
    }
}