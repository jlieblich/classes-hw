package com.jlieblich;

import java.util.*;

/**
 * Created by jonlieblich on 10/11/16.
 */
public class Playlist {
    private String mName;
    private ArrayList<Song> mSongs;

    public Playlist(String name) {
        mName = name;
        mSongs = new ArrayList<>();
    }

    public String getName() {
        return mName;
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public void playAll() {
        for (Song song : mSongs) {
            song.play();
        }
    }
}
