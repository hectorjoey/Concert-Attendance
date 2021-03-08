package com.company;

import java.time.LocalDate;

public class Concerts {
   private long id;
    //variables
    private String artist;
    private int attendance;
    private long venueId;
    private String date;


    public Concerts(long id, String artist, int attendance, long venueId,   String date) {
        this.id = id;
        this.artist = artist;
        this.attendance = attendance;
        this.venueId = venueId;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public long getVenueId() {
        return venueId;
    }

    public void setVenueId(long venueId) {
        this.venueId = venueId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}