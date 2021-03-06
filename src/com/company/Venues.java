package com.company;

import java.util.HashSet;
import java.util.Set;

public class Venues {
    //variables
    long Id;
    String name;
    String location;
    String yearOfOpen;
    int capacity;
    int maxCapacity;
    Set<Concerts> concertsSet = new HashSet<>();

    public Venues() {
    }


//    public String percentageCapacity(int capacity, int maxCapacity) {
//        int percentage = (capacity * 100) / maxCapacity;
//
//        if (percentage >= 85) {
//            System.out.println("Capacity warning triggered");
//        } else {
//            System.out.println("Capacity ok!");
//        }
//        return percentage + "%";
//    }

    @Override
    public String toString() {
        return "Venues{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", yearOfOpen='" + yearOfOpen + '\'' +
                ", capacity=" + capacity +
                ", maxCapacity=" + maxCapacity +
                ", concerts=" + concertsSet +
                '}';
    }
}