package com.example.zensea.bottomnav_with_fragment;

import org.parceler.Parcel;

/**
 * Created by Zensea on 19-Jul-17.
 */
@Parcel
public class DataModel {

    String title;
    String descrition;
    int photoId;

    public DataModel(){}

    public DataModel(String title, String descrition, int photoId) {
        this.title = title;
        this.descrition = descrition;
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
