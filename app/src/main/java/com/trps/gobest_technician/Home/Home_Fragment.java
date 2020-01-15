package com.trps.gobest_technician.Home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;
import com.trps.gobest_technician.Adapter.HorizontalRecyclerViewAdapter;
import com.trps.gobest_technician.MainActivity;
import com.trps.gobest_technician.Model.ImageModel;
import com.trps.gobest_technician.R;
import com.trps.gobest_technician.Staff.Staff_Fragment;

import java.util.ArrayList;


public class Home_Fragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener, MainActivity.OnBackPressedListener {

    LinearLayout staff,order,news,accounts,status,franchise,discount,enquiries,more;
    RecyclerView HorizontalRecyclerView;
    HorizontalRecyclerViewAdapter horizontalAdapter;
    LinearLayoutManager horizontalLayoutManager;


    public Home_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(R.layout.fragment_home, container, false);

        HorizontalRecyclerView = (RecyclerView)view.findViewById(R.id.horizontalRecyclerView);
        horizontalAdapter = new HorizontalRecyclerViewAdapter(fillWithData(), getActivity());
        horizontalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        HorizontalRecyclerView.setLayoutManager(horizontalLayoutManager);
        HorizontalRecyclerView.setAdapter(horizontalAdapter);

        staff = view.findViewById(R.id.staff_home_admin);
        order = view.findViewById(R.id.order_home_admin);
        news = view.findViewById(R.id.news_home_admin);
        accounts = view.findViewById(R.id.account_home_admin);
        status = view.findViewById(R.id.status_home_admin);
        franchise = view.findViewById(R.id.franchise_home_admin);
        discount = view.findViewById(R.id.discount_home_admin);
        enquiries = view.findViewById(R.id.enquiry_home_admin);
        more = view.findViewById(R.id.more_home_admin);

        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new Staff_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return view;
    }

    public ArrayList<ImageModel> fillWithData() {
        ArrayList<ImageModel> imageModelArrayList = new ArrayList<>();
        ImageModel imageModel0 = new ImageModel();
        imageModel0.setId(System.currentTimeMillis());
        imageModel0.setImageName("Battle");
        imageModel0.setImagePath(R.drawable.bikeservice);
        imageModelArrayList.add(imageModel0);

        ImageModel imageModel1 = new ImageModel();
        imageModel1.setId(System.currentTimeMillis());
        imageModel1.setImageName("Beer");
        imageModel1.setImagePath(R.drawable.caracservice);
        imageModelArrayList.add(imageModel1);

        ImageModel imageModel2 = new ImageModel();
        imageModel2.setId(System.currentTimeMillis());
        imageModel2.setImageName("Ferrari");
        imageModel2.setImagePath(R.drawable.carservice);
        imageModelArrayList.add(imageModel2);

        ImageModel imageModel3 = new ImageModel();
        imageModel3.setId(System.currentTimeMillis());
        imageModel3.setImageName("JetPack");
        imageModel3.setImagePath(R.drawable.dentremoval);
        imageModelArrayList.add(imageModel3);

        ImageModel imageModel4 = new ImageModel();
        imageModel4.setId(System.currentTimeMillis());
        imageModel4.setImageName("Terraria");
        imageModel4.setImagePath(R.drawable.suspensionservice);
        imageModelArrayList.add(imageModel4);

        ImageModel imageModel5 = new ImageModel();
        imageModel5.setId(System.currentTimeMillis());
        imageModel5.setImageName("Three D");
        imageModel5.setImagePath(R.drawable.interiordetailing);
        imageModelArrayList.add(imageModel5);
        return imageModelArrayList;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Home");
        ((MainActivity) getActivity()).setOnBackPressedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public void doBack() {
        Intent intent = new Intent(getActivity(),MainActivity.class);
        startActivity(intent);
        getActivity().overridePendingTransition(0,0);
    }


}
