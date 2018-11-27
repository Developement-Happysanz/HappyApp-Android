package com.happysanz.happyapp.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.happysanz.happyapp.R;

public class AboutUsFragment extends Fragment {

    private View rootView;
    TextView india, singapore, textIndia, textSingapore;
    boolean expandIndia = false;
    boolean expandSg = false;

    public static AboutUsFragment newInstance(int position) {
        AboutUsFragment frag = new AboutUsFragment();
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

        rootView = inflater.inflate(R.layout.fragment_about_us, container, false);
        india = rootView.findViewById(R.id.india);
        textIndia = rootView.findViewById(R.id.address_india);
        singapore = rootView.findViewById(R.id.singapore);
        textSingapore = rootView.findViewById(R.id.address_sg);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!expandIndia){
                    textIndia.setVisibility(View.VISIBLE);
                    india.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_minus, 0);
                    expandIndia = !expandIndia;
                } else {
                    textIndia.setVisibility(View.GONE);
                    india.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_plus, 0);
                    expandIndia = !expandIndia;
                }
            }
        });
        singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!expandSg){
                    textSingapore.setVisibility(View.VISIBLE);
                    singapore.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_minus, 0);
                    expandSg = !expandSg;
                } else {
                    textSingapore.setVisibility(View.GONE);
                    singapore.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_plus, 0);
                    expandSg = !expandSg;
                }
            }
        });


        return rootView;
    }
}
