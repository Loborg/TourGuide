package com.example.android.tourguide.models;

public class Sight {
    private int mImageResourceId;
    private int mBgColorResourceId;
    private String mTitleText;
    private String mDescriptionText;

    public Sight(int imageResourceId, String titleText, String descriptionText, int BgColorResourceId){
        mImageResourceId = imageResourceId;
        mTitleText = titleText;
        mDescriptionText = descriptionText;
        mBgColorResourceId = BgColorResourceId;
    }

    public int getImageResourceID(){
        return mImageResourceId;
    }

    public int getBgColorResourceId(){
        return mBgColorResourceId;
    }

    public String getTitleText(){
        return mTitleText;
    }

    public String getDescriptionText(){
        return mDescriptionText;
    }
}
