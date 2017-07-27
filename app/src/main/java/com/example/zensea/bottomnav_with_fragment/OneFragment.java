package com.example.zensea.bottomnav_with_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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
public class OneFragment extends Fragment {


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Heart บำรุงหัวใจ");

        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        List<DataModel> items = new ArrayList<DataModel>();
        items.add(new DataModel("วิตามินอี", "บผลการวิจัยหลาย ๆ สำนักสรุปตรงกันว่า การเสริมอาหารด้วยวิตามินอี 200-400ยูนิตสากล (IU) จะเป็นประโยชน์ระยะยาวต่อระบบหลอดเลือด เพราะวิตามินอีไปลดกระบวนการออกซิเดชั่นหรือการสันดาประหว่างอนุมูลอิสระกับไขมันตัวร้าย (LDL) ในร่างกาย\n" +
                "\n" +
                "เมื่อลดการสันดาปไขมันก็ไม่เกาะติดกับผนังหลอดเลือดมากไป เลือดก็ไหลเวียนดีไม่ติดขัด อุดตันให้หวาดเสียวหัวใจ เราหาวิตามินอีได้จากอาหารประเภทน้ำมันพืช เช่นทานตะวัน ถั่วอัลมอนด์ ผักปวยเล้ง",R.drawable.ic_alarm_black_24dp));
        items.add(new DataModel("B", "บำรุงสมอง",R.drawable.ic_star_black_24dp));
        items.add(new DataModel("C", "บำรุงผิว",R.drawable.vitc));
        items.add(new DataModel("Vitamin D", "วิตามินซี",R.drawable.vitc));


        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv1);
        rv.setHasFixedSize(true);

        //RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(), 2);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv.setLayoutManager(manager);
        rv.setAdapter(new MyAdapter(items));




       /* String[] values = new String[] {"Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D", "Vitamin E"
                , "Vitamin B1", "Vitamin B2"};*/

       /* MyAdapter adapter = new MyAdapter(new String[]{"Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D", "Vitamin E"
                , "Example 6", "Example 7"});
        rv.setAdapter(adapter);*/

       /* LinearLayoutManager lim = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lim);*/

        return rootView;
    }

}
