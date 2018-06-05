package com.example.android.androidbasicsudacityprojectfour;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<Song>();
        Resources res = getResources();
        String[] songPerformer = res.getStringArray(R.array.rock_singers);
        String[] songName = res.getStringArray(R.array.rock_songs);
        int numberOfSongs = songPerformer.length;
        for (int i = 0; i < numberOfSongs; i++) {
            songs.add(new Song(songPerformer[i], songName[i], R.drawable.ic_play));
        }

        //ArrayAdapter
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
