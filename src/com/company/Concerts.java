package com.company;

import java.time.LocalDate;

public class Concerts {
    int id;
    //variables
    private  String artist;
    private int attendance;
    private LocalDate date;

    public Concerts(int id, String artist, int attendance, LocalDate date) {
        this.id = id;
        this.artist = artist;
        this.attendance = attendance;
        this.date = date;
    }

//getters and setters of the variables
    public int getId() {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void aveVenueAttendance(int attendance){
        int[] averageAttendance = {attendance};
        int sum = 0;
        for (int value : averageAttendance) {
            sum += value;
        }
        double average = ((double) sum) / averageAttendance.length;

        System.out.println("AVerage :::" + average);
    }
}
