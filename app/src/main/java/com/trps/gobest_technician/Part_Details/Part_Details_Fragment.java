package com.trps.gobest_technician.Part_Details;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trps.gobest_technician.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Part_Details_Fragment extends Fragment {


    public Part_Details_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_part__details, container, false);
    }

}
