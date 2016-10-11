package com.jlieblich;

public class Main {

    public static void main(String[] args) {
	    User me = new User("Jon");
        Song song1 = new Song("Name1", "Artist1", "Album1");
        Song song2 = new Song("Name2", "Artist2", "Album2");
        Song song3 = new Song("Name3", "Artist3", "Album3");
        Song song4 = new Song("Name4", "Artist4", "Album4");
        Song ss = new Song("Sandstorm", "Darude", "DUDUDUDUDU");

        Playlist generic = new Playlist("Boring");
        generic.addSong(song1);
        generic.addSong(song2);
        generic.addSong(song3);
        generic.addSong(song4);

        Playlist partyTime = new Playlist("Fun");
        for(int i=0;i<20;i++) {
            partyTime.addSong(ss);
        }

        me.addPlaylist(generic);
        me.addPlaylist(partyTime);

        System.out.println("Playlists: " + me.getAllPlaylistNames() + "\n");
        System.out.println("Playing " + generic.getName());
        generic.playAll();
        System.out.println("Playing " + partyTime.getName());
        partyTime.playAll();
    }
}
