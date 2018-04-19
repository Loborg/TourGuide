package com.example.android.tourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.SightAdapter;
import com.example.android.tourguide.models.Data;

public class KeszthelyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.common_fragment, container, false);
        rootView.setTag("keszthely");

        Data data = new Data(getActivity());
        SightAdapter adapter = new SightAdapter(getActivity(), data.keszthelyList);
        ListView list = rootView.findViewById(R.id.common_list);
        list.setAdapter(adapter);
        return rootView;
    }
}
