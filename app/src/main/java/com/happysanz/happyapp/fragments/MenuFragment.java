package com.happysanz.happyapp.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.happysanz.happyapp.R;
import com.happysanz.happyapp.activity.SignInActivity;

public class MenuFragment extends Fragment {

    private View rootView;
    TextView signIn;

    public static MenuFragment newInstance(int position) {
        MenuFragment frag = new MenuFragment();
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

        rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        signIn = rootView.findViewById(R.id.signin);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(getActivity(), SignInActivity.class);

                startActivity(homeIntent);
            }
        });

        return rootView;
    }
}
