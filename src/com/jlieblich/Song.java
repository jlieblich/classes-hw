package com.jlieblich;

/**
 * Created by jonlieblich on 10/11/16.
 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String songName, String artistName, String albumName) {
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    public void play() {
        System.out.println(mSongName + " by " + mArtistName + " from " + mAlbumName);
    }
}
