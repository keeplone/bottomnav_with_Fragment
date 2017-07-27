package com.example.zensea.bottomnav_with_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zensea.bottomnav_with_fragment.Adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {


    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Two");

        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

        List<DataModel> items = new ArrayList<DataModel>();
        items.add(new DataModel("Vitamin A", "AAAA",R.drawable.vita200px));
        items.add(new DataModel("Vitamin B", "BBBB",R.drawable.ic_star_black_24dp));
        items.add(new DataModel("Vitamin C", "วิตามินซี",R.drawable.vitc200px));

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv2);
        rv.setHasFixedSize(true);

        LinearLayoutManager lim = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(lim);
        rv.setAdapter(new MyAdapter(items));

        return rootView;
    }

}
