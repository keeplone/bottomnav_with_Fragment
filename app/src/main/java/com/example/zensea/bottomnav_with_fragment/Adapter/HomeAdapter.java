package com.example.zensea.bottomnav_with_fragment.Adapter;


import android.content.Context;
import android.content.Intent;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zensea.bottomnav_with_fragment.DataModel;
import com.example.zensea.bottomnav_with_fragment.OneFragment;
import com.example.zensea.bottomnav_with_fragment.R;
import com.example.zensea.bottomnav_with_fragment.TwoFragment;
import com.example.zensea.bottomnav_with_fragment.VitDetailFragment;

import org.parceler.Parcels;

import java.util.List;


/**
 * Created by Zensea on 14-Jul-17.
 */

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<DataModel> ListaObj;

    public HomeAdapter(List<DataModel> listaObj){
        this.ListaObj = listaObj;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_home, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        MyViewHolder holder1 = (MyViewHolder) holder;
        holder1.mTextViewH.setText(ListaObj.get(position).getTitle());
        holder1.mTextdescritionH.setText(ListaObj.get(position).getDescrition());
        holder1.mImageViewH.setImageResource(ListaObj.get(position).getPhotoId());

       /* holder1.mCardViewH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*DataModel data = new DataModel(ListaObj.get(position).getTitle(), ListaObj.get(position).getDescrition(),
                        ListaObj.get(position).getPhotoId());
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("mKey", Parcels.wrap(data));
                v.getContext().startActivity(intent);*/

            }
     //   });
   // }

    @Override
    public int getItemCount() {
        if (ListaObj != null) {
            return this.ListaObj.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public CardView mCardViewH;
        public TextView mTextViewH;
        public TextView mTextdescritionH;
        public ImageView mImageViewH;
        private final Context context;

        public MyViewHolder(View v){
            super(v);
            context = v.getContext();
            mCardViewH = (CardView) v.findViewById(R.id.card_viewH);
            mTextViewH = (TextView) v.findViewById(R.id.titleTextViewH);
            mTextdescritionH = (TextView) v.findViewById(R.id.textdescriH);
            mImageViewH = (ImageView) v.findViewById(R.id.coverImageViewH);

            mCardViewH.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getPosition()){
                        case 0:
                            OneFragment fragment = new OneFragment();
                            ((FragmentActivity)context).getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.main_container, fragment)
                                    .addToBackStack(null)
                                    .commit();
                            break;
                    }
                }
            });
        }
    }
}
