package com.example.android.tourguide.models;

import android.content.Context;

import com.example.android.tourguide.R;
import com.example.android.tourguide.activitys.Keys;

import java.util.ArrayList;

public class Data {
    public Context mContext;
    public ArrayList<Integer> mainImagesResourceIdList = new ArrayList<Integer>();
    public ArrayList<Integer> sightsColor = new ArrayList<Integer>();
    public ArrayList<Sight> keszthelyList = new ArrayList<Sight>();
    public ArrayList<Sight> szegedList = new ArrayList<Sight>();
    public ArrayList<Sight> pecsList = new ArrayList<Sight>();
    public ArrayList<Sight> alfoldList = new ArrayList<Sight>();


    public Data(Context context){
        mContext = context;
        populateMainImagesResourceIdList();
        populateKeszthelyList();
        populateSzegedList();
        populatePecsList();
        populateAlfoldList();
        populateSightsColor();
    }

    private void populateMainImagesResourceIdList(){
        mainImagesResourceIdList.add(mContext.getResources().getIdentifier("keszthely", Keys.DRAWABLE, mContext.getPackageName()));
        mainImagesResourceIdList.add(mContext.getResources().getIdentifier("szeged", Keys.DRAWABLE, mContext.getPackageName()));
        mainImagesResourceIdList.add(mContext.getResources().getIdentifier("pecs", Keys.DRAWABLE, mContext.getPackageName()));
        mainImagesResourceIdList.add(mContext.getResources().getIdentifier("alfold", Keys.DRAWABLE, mContext.getPackageName()));
    }

    private void populateKeszthelyList(){
        keszthelyList.add(new Sight(
                mContext.getResources().getIdentifier("balaton_museum", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.keszthely_color)));

        keszthelyList.add(new Sight(
                mContext.getResources().getIdentifier("festetics", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description),
                mContext.getResources().getColor(R.color.keszthely_color)));

        keszthelyList.add(new Sight(
                mContext.getResources().getIdentifier("szigetfurdo", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description),
                mContext.getResources().getColor(R.color.keszthely_color)));

        keszthelyList.add(new Sight(
                mContext.getResources().getIdentifier("uloszobor", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description),
                mContext.getResources().getColor(R.color.keszthely_color)));
    }

    private void populateSzegedList(){
        szegedList.add(new Sight(
                mContext.getResources().getIdentifier("dom", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.szeged_color)));

        szegedList.add(new Sight(
                mContext.getResources().getIdentifier("dom_square", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.szeged_color)));

        szegedList.add(new Sight(
                mContext.getResources().getIdentifier("hosok_kapuja", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.szeged_color)));

        szegedList.add(new Sight(
                mContext.getResources().getIdentifier("viztorony", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.szeged_color)));
    }

    private void populatePecsList(){
        pecsList.add(new Sight(
                mContext.getResources().getIdentifier("dzsami", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.pecs_color)));

        pecsList.add(new Sight(
                mContext.getResources().getIdentifier("szekesegyhaz", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.pecs_color)));

        pecsList.add(new Sight(
                mContext.getResources().getIdentifier("tv_torony", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.pecs_color)));

        pecsList.add(new Sight(
                mContext.getResources().getIdentifier("zsolnay_museum", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.pecs_color)));
    }

    private void populateAlfoldList(){
        alfoldList.add(new Sight(
                mContext.getResources().getIdentifier("gyula_var", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.alfold_color)));

        alfoldList.add(new Sight(
                mContext.getResources().getIdentifier("hajospincefalu", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.alfold_color)));

        alfoldList.add(new Sight(
                mContext.getResources().getIdentifier("kilenclyuku_hid", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.alfold_color)));

        alfoldList.add(new Sight(
                mContext.getResources().getIdentifier("opusztaszer", Keys.DRAWABLE, mContext.getPackageName()),
                mContext.getResources().getString(R.string.list_item_sample_title),
                mContext.getResources().getString(R.string.list_item_sample_description), mContext.getResources().getColor(R.color.alfold_color)));
    }

    private void populateSightsColor(){
        sightsColor.add(keszthelyList.get(0).getBgColorResourceId());
        sightsColor.add(szegedList.get(0).getBgColorResourceId());
        sightsColor.add(pecsList.get(0).getBgColorResourceId());
        sightsColor.add(alfoldList.get(0).getBgColorResourceId());
    }
}
