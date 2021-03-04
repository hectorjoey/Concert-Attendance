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


    public String percentageCapacity(int capacity, int maxCapacity) {
        int percentage = (capacity * 100) / maxCapacity;

        if (percentage >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        return percentage + "%";
    }



}
