package com.example.zensea.bottomnav_with_fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setTitle("Detail");

        //Intent i = getIntent();
        DataModel data = (DataModel) Parcels.unwrap(getIntent().getParcelableExtra("mKey"));
        String titile = data.getTitle();
        String Des = data.getDescrition();
        int img = data.getPhotoId();


        ImageView im = (ImageView) findViewById(R.id.imageDetail);
        TextView titleDetail = (TextView) findViewById(R.id.TextTitleDetail);
        TextView tvDetail = (TextView) findViewById(R.id.TextDetail);

        //Toast.makeText(getApplicationContext(), "Test"+img, Toast.LENGTH_SHORT).show();

        im.setImageResource(img);
        titleDetail.setText(titile);
        tvDetail.setText(Des);


    }
}
