package com.firex.media.movietorrent;

import android.app.Application;

import com.firex.media.movietorrent.Utilities.MyVolleySingleton;

public class MovieTorrent extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MyVolleySingleton.getInstance(this);
    }
}
