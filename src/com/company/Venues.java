package com.company;

import java.util.ArrayList;

public class Venues {
    //variables
     String name;
     String location;
     String yearOfOpen;
     int capacity;
     int maxCapacity;

    ArrayList<Concerts> concertsList;

    public  Venues(){}

    public Venues(String name, String location, String yearOfOpen, int capacity, ArrayList<Concerts> concertsList) {
        this.name = name;
        this.location = location;
        this.yearOfOpen = yearOfOpen;
        this.capacity = capacity;
        this.concertsList = concertsList;
    }

    public String percentageCapacity(int capacity, int maxCapacity) {
        int percentage = (capacity * 100) / maxCapacity;

        if (percentage >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        return percentage + "%";
    }


    public ArrayList<Concerts> getConcertsList() {
        return concertsList;
    }


}
