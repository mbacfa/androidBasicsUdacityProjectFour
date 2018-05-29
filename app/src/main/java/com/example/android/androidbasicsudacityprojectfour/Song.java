package com.example.android.androidbasicsudacityprojectfour;

public class Song {

    private String mSongPerformer;

    private String mSongName;

    public Song (String songPerformer, String songName) {
        mSongPerformer = songPerformer;
        mSongName = songName;
    }

    public String getName() {
        return mSongName;
    }

    public String getPerformer() {
        return mSongPerformer;
    }
}
