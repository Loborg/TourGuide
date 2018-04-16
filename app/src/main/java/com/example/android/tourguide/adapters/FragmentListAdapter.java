package com.example.android.tourguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.example.android.tourguide.models.Sight;

import java.util.ArrayList;

public class FragmentListAdapter extends ArrayAdapter<Sight> {
    public FragmentListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Sight> objects) {
        super(context, 0, objects);
    }
}
