package com.example.android.androidbasicsudacityprojectfour;

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
        songs.add(new Song("PerformerPlaceholder1", "NamePlaceholder1"));
        songs.add(new Song("PerformerPlaceholder2", "NamePlaceholder2"));
        songs.add(new Song("PerformerPlaceholder3", "NamePlaceholder3"));
        songs.add(new Song("PerformerPlaceholder4", "NamePlaceholder4"));
        songs.add(new Song("PerformerPlaceholder5", "NamePlaceholder5"));
        songs.add(new Song("PerformerPlaceholder6", "NamePlaceholder6"));
        songs.add(new Song("PerformerPlaceholder7", "NamePlaceholder7"));
        songs.add(new Song("PerformerPlaceholder8", "NamePlaceholder8"));
        songs.add(new Song("PerformerPlaceholder9", "NamePlaceholder9"));

        //ArrayAdapter
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
