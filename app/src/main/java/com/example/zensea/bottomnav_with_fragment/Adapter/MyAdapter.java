package com.example.zensea.bottomnav_with_fragment.Adapter;


import android.app.Activity;
import android.content.Intent;

import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.zensea.bottomnav_with_fragment.DataModel;
import com.example.zensea.bottomnav_with_fragment.DetailActivity;
import com.example.zensea.bottomnav_with_fragment.R;

import org.parceler.Parcels;

import java.util.List;


/**
 * Created by Zensea on 14-Jul-17.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<DataModel> ListaObj;

    public MyAdapter(List<DataModel> listaObj){
        this.ListaObj = listaObj;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            MyViewHolder holder1 = (MyViewHolder) holder;
            holder1.mTextView.setText(ListaObj.get(position).getTitle());
            holder1.mTextdescrition.setText(ListaObj.get(position).getDescrition());
            holder1.mImageView.setImageResource(ListaObj.get(position).getPhotoId());

            holder1.mCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  DataModel data = new DataModel(ListaObj.get(position).getTitle(), ListaObj.get(position).getDescrition(),
                            ListaObj.get(position).getPhotoId());
                    Intent intent = new Intent(v.getContext(), DetailActivity.class);
                    ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) v.getContext(), v.findViewById(R.id.thumbnailR), "myImage");
                    intent.putExtra("mKey", Parcels.wrap(data));
                    v.getContext().startActivity(intent, optionsCompat.toBundle());

                }
            });
    }

    @Override
    public int getItemCount() {
        if (ListaObj != null) {
            return this.ListaObj.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public CardView mCardView;
        public TextView mTextView;
        public TextView mTextdescrition;
        public ImageView mImageView;

        public MyViewHolder(View v){
            super(v);
            mCardView = (CardView) v.findViewById(R.id.cvR);
            mTextView = (TextView) v.findViewById(R.id.titleR);
            mTextdescrition = (TextView) v.findViewById(R.id.descriR);
            mImageView = (ImageView) v.findViewById(R.id.thumbnailR);
        }
    }
}
