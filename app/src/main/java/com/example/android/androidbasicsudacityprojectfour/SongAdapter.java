package com.example.android.androidbasicsudacityprojectfour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context,0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView songPerformer = (TextView) convertView.findViewById(R.id.song_performer_text_view);
        songPerformer.setText(currentSong.getPerformer());
        TextView songName = (TextView) convertView.findViewById(R.id.song_name_text_view);
        songName.setText(currentSong.getName());
        ImageView iconView = (ImageView) convertView.findViewById(R.id.play_icon);
        iconView.setImageResource(currentSong.getImageResourceId());
        return convertView;
    }
}
