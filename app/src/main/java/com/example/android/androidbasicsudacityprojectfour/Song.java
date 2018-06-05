package com.example.android.androidbasicsudacityprojectfour;

public class Song {

    private String mSongPerformer;

    private String mSongName;

    private int mImageResourceId;

    public Song(String songPerformer, String songName, int imageResourceId) {
        mSongPerformer = songPerformer;
        mSongName = songName;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mSongName;
    }

    public String getPerformer() {
        return mSongPerformer;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
