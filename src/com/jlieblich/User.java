package com.jlieblich;

import java.util.*;

/**
 * Created by jonlieblich on 10/11/16.
 */
public class User {
    private String mName;
    private HashMap<String, Playlist> mPlaylists;

    public User(String name) {
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist) {
        mPlaylists.put(playlist.getName(), playlist);
    }

    public Collection<String> getAllPlaylistNames() {
        return mPlaylists.keySet();
    }

    public Playlist getPlaylistByName(String name) {
        if(mPlaylists.containsKey(name)) {
            return mPlaylists.get(name);
        }
        return null;
    }
}
