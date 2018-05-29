package com.example.android.androidbasicsudacityprojectfour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context,0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView songPerformer = (TextView) listItemView.findViewById(R.id.song_performer_text_view);
        songPerformer.setText(currentSong.getPerformer());
        TextView songName = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songName.setText(currentSong.getName());
        return listItemView;
    }
}
