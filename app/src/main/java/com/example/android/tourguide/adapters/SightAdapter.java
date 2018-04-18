package com.example.android.tourguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.models.Sight;

import java.util.ArrayList;

public class SightAdapter extends ArrayAdapter<Sight> {
    public SightAdapter(@NonNull Context context, @NonNull ArrayList<Sight> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list_item, parent, false);
            holder = new ViewHolder();
            holder.sightImage = convertView.findViewById(R.id.sight_image);
            holder.sightTextFrame = convertView.findViewById(R.id.sight_text_frame);
            holder.sightTitle = convertView.findViewById(R.id.sight_title);
            holder.sightDescription = convertView.findViewById(R.id.sight_description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Sight sights = getItem(position);

        holder.sightImage.setImageResource(sights.getImageResourceID());
        holder.sightTextFrame.setBackgroundColor(sights.getBgColorResourceId());
        holder.sightTitle.setText(sights.getTitleText());
        holder.sightDescription.setText(sights.getDescriptionText());

        return convertView;
    }

    static class ViewHolder {
        ImageView sightImage;
        FrameLayout sightTextFrame;
        TextView sightTitle;
        TextView sightDescription;
    }
}
