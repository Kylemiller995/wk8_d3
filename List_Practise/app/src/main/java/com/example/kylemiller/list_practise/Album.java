package com.example.kylemiller.list_practise;

/**
 * Created by kylemiller on 20/09/2017.
 */

public class Album {
    String name;
    String genre;
    String artist;
    Integer ranking;

    public Album(Integer ranking, String name, String genre, String artist) {
        this.ranking = ranking;
        this.name = name;
        this.genre = genre;
        this.artist = artist;
    }

    public Integer getRanking(){
        return ranking;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getArtist() {
        return artist;
    }

}
