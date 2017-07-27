package com.example.zensea.bottomnav_with_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zensea.bottomnav_with_fragment.Adapter.HomeAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Vitamin");

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        List<DataModel> items = new ArrayList<DataModel>();
        items.add(new DataModel("Heart", "บำรุงหัวใจ",R.drawable.herat));
        items.add(new DataModel("Brain", "บำรุงสมอง",R.drawable.ic_star_black_24dp));
        items.add(new DataModel("Skin", "บำรุงผิว",R.drawable.vitc));
        items.add(new DataModel("Eye", "บำรุงสายตา",R.drawable.ic_notifications_black_24dp));
        items.add(new DataModel("Bone", "บำรุงกระดูก",R.drawable.ic_dots));
        items.add(new DataModel("Hair", "บำรุงเส้นผม",R.drawable.ic_home_black_24dp));


        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rvH);
        rv.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(), 2);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv.setLayoutManager(manager);
        rv.setAdapter(new HomeAdapter(items));



        return rootView;
    }

}
