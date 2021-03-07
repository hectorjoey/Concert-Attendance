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
    Set<Concerts> concertsSet = new HashSet<>();

    public Venues() {
    }
}