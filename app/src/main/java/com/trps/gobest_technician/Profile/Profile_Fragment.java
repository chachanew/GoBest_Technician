package com.trps.gobest_technician.Profile;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.trps.gobest_technician.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile_Fragment extends Fragment {

    TextView name,email,address,phoneNo,salary,company_email;

    TextView target_total,target_today,target_income,sell_income,sell_total,sell_today;



    public Profile_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = getLayoutInflater().inflate(R.layout.fragment_profile, container, false);


        //FloatingActionButton fab = view.findViewById(R.id.fab);

        //fab.setVisibility(View.GONE);

        name =view.findViewById(R.id.staff_name);
        email = view.findViewById(R.id.staff_email);
        address = view.findViewById(R.id.staff_addresss);
        phoneNo = view.findViewById(R.id.staff_phone);
        salary = view.findViewById(R.id.staff_salary);
        company_email = view.findViewById(R.id.staff_companyemail);

        LinearLayout currency_setting = view.findViewById(R.id.currency_setting);

        currency_setting.setVisibility(View.GONE);

        View view1 = view.findViewById(R.id.admin_home_include);

        target_today = view1.findViewById(R.id.outstanding_counttext1);
        target_total = view1.findViewById(R.id.outstanding_counttext);
        target_income = view1.findViewById(R.id.outstanding_totalmoney);
        sell_today = view1.findViewById(R.id.overdue_counttext);
        sell_total = view1.findViewById(R.id.outstanding_counttext11);
        sell_income = view1.findViewById(R.id.overdue_totalmoney);
        name.setText(getActivity().getIntent().getStringExtra("name"));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Profile");
    }

}
