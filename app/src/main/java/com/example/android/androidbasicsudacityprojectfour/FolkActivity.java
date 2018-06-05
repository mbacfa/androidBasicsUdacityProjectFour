package com.example.android.androidbasicsudacityprojectfour;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FolkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        //Need to replace this with a loop and to put all names in strings
        ArrayList<Song> songs = new ArrayList<Song>();
        Resources res = getResources();
        String[] songPerformer = res.getStringArray(R.array.folk_singers);
        String[] songName = res.getStringArray(R.array.folk_songs);
        int numberOfSongs = songPerformer.length;
        for (int i = 0; i < numberOfSongs; i++) {
            songs.add(new Song(songPerformer[i], songName[i]));
        }

        //ArrayAdapter
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
