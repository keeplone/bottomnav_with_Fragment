package com.example.zensea.bottomnav_with_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.zensea.bottomnav_with_fragment.Adapter.MyAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Example 1", "Example 2", "Example 3", "Example 4", "Example 5"
                , "Example 6", "Example 7"});
        rv.setAdapter(adapter);

        LinearLayoutManager lim = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lim);

        return rootView;
    }

}
