package com.example.zensea.bottomnav_with_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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
public class FourFragment extends Fragment {


    public FourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four, container, false);

        List<DataModel> items = new ArrayList<DataModel>();
        items.add(new DataModel("Vitamin A", "Retinoid",R.drawable.ic_alarm_black_24dp));
        items.add(new DataModel("Vitamin B", "BBBB",R.drawable.ic_star_black_24dp));
        items.add(new DataModel("Vitamin C", "Ascorbic acid",R.drawable.vitc));

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv4);
        rv.setHasFixedSize(true);
       /* MyAdapter adapter = new MyAdapter(new String[]{"Example 1", "Example 2", "Example 3", "Example 4", "Example 5"
                , "Example 6", "Example 7"});
        rv.setAdapter(adapter);*/

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv.setLayoutManager(gridLayoutManager);
        rv.setAdapter(new MyAdapter(items));


        return view;
    }

}
