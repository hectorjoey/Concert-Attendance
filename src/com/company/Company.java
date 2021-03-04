package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Company {

    public static void main(String[] args) {
//objects of concerts
        Concerts concerts = new Concerts(1, "TuFace", 5000, LocalDate.now());
        Concerts concerts1 = new Concerts(2, "PSquare", 5000, LocalDate.now());
        Concerts concerts2 = new Concerts(3, "Celine Dion", 20000, LocalDate.now());
        Concerts concerts3 = new Concerts(4, "Hector", 10000, LocalDate.now());
        Concerts concerts4 = new Concerts(5, "Stan", 25000, LocalDate.now());

//objects of venues
        Venues venues = new Venues();
        venues.name = "Arts Club Liverpool";
        venues.capacity = 200;
        venues.maxCapacity = 1300;
        venues.yearOfOpen = "1800";
        venues.location = "90 Seel Street, Liverpool";
//        array list of concerts
        venues.concertsList = new ArrayList<>();
        venues.concertsList.add(concerts1);

        venues.percentageCapacity(venues.capacity, venues.maxCapacity);

        System.out.println("Percentage:::" + venues.percentageCapacity(venues.capacity, venues.maxCapacity));
        venues.concertsList.add(concerts2);
        venues.concertsList.add(concerts3);
        venues.concertsList.add(concerts4);

        Venues venues1 = new Venues();
        venues1.name = "O2 ABC Glasgow";
        venues1.maxCapacity = 1300;
        venues1.yearOfOpen = "1875";
        venues1.location = "300 Sauchiehall St, Glasgow";
        venues1.concertsList = new ArrayList<>();
        venues1.concertsList.add(concerts);
        venues1.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        venues1.percentageCapacity(24000, 1300);
        System.out.println("Percentage:::" + venues1.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues.concertsList);
        System.out.println("Venues ::" + venues1.concertsList);


        Venues venues2 = new Venues();
        venues2.name = "O2 Academy Birmingham";
        venues2.maxCapacity = 3009;
        venues2.yearOfOpen = "2009";
        venues2.location = "16-18 Horsefair, Birmingham";
        venues2.concertsList = new ArrayList<>();
        venues2.concertsList.add(concerts);
        venues2.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues2.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);


        Venues venues3 = new Venues();
        venues3.name = "O2 Academy Bournemouth";
        venues3.maxCapacity = 5080;
        venues3.yearOfOpen = "1895";
        venues3.location = "16-18 Horsefair, Birmingham";
        venues3.concertsList = new ArrayList<>();
        venues3.concertsList.add(concerts);
        venues3.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues3.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);


        Venues venues4 = new Venues();
        venues4.name = "O2 Academy Birmingham";
        venues4.maxCapacity = 3009;
        venues4.yearOfOpen = "2009";
        venues4.location = "570 Christchurch Road, Boscombe";
        venues4.concertsList = new ArrayList<>();
        venues4.concertsList.add(concerts);
        venues4.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues2.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);

        Venues venues5 = new Venues();
        venues5.name = "O2 Academy Bristol";
        venues5.maxCapacity = 3400;
        venues5.yearOfOpen = "2001";
        venues5.location = "1-2 Frogmore Street, Bristol";
        venues5.concertsList = new ArrayList<>();
        venues5.concertsList.add(concerts);
        venues5.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues5.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);

        Venues venues6 = new Venues();
        venues6.name = "O2 Academy Brixton";
        venues6.maxCapacity = 16012;
        venues6.yearOfOpen = "1929";
        venues6.location = "211 Stockwell Road, London";
        venues6.concertsList = new ArrayList<>();
        venues6.concertsList.add(concerts);
        venues6.concertsList.add(concerts1);
        System.out.println("Percentage:::" + venues6.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);


        Venues venues7 = new Venues();
        venues7.name = "O2 Academy Islington";
        venues7.maxCapacity = 1050;
        venues7.yearOfOpen = "1875";
        venues7.location = "16 Parkfield Street, London";
        venues7.concertsList = new ArrayList<>();
        venues7.concertsList.add(concerts);
        venues7.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        venues1.percentageCapacity(24000, 1300);
        System.out.println("Percentage:::" + venues1.percentageCapacity(5000, venues7.maxCapacity));

        System.out.println("Venues ::" + venues.concertsList);
        System.out.println("Venues ::" + venues1.concertsList);


        Venues venues8 = new Venues();
        venues8.name = "O2 Academy Leeds";
        venues8.maxCapacity = 2300;
        venues8.yearOfOpen = "1885";
        venues8.location = "55 Cookridge Street, Leeds";
        venues8.concertsList = new ArrayList<>();
        venues8.concertsList.add(concerts);
        venues8.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues8.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues8.concertsList);
        System.out.println("Venues ::" + venues8.concertsList);

        Venues venues9 = new Venues();
        venues9.name = "O2 Academy Glasgow";
        venues9.maxCapacity = 2600;
        venues9.yearOfOpen = "1921";
        venues9.location = "121 Eglinton Street, Glasgow";
        venues9.concertsList = new ArrayList<>();
        venues9.concertsList.add(concerts);
        venues9.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues3.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);


        Venues venues10 = new Venues();
        venues10.name = "O2 Academy Leicester";
        venues10.maxCapacity = 1600;
        venues10.yearOfOpen = "2010";
        venues10.location = "Percy Gee Building, University Rd, Leicester";
        venues10.concertsList = new ArrayList<>();
        venues10.concertsList.add(concerts);
        venues10.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues10.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);

        Venues venues11 = new Venues();
        venues11.name = "O2 Academy Liverpool";
        venues11.maxCapacity = 1200;
        venues11.yearOfOpen = "2003";
        venues11.location = "11-13 Hotham St, Liverpool";
        venues11.concertsList = new ArrayList<>();
        venues11.concertsList.add(concerts);
        venues11.concertsList.add(concerts1);
//        venues1.concertsList.add(concerts2);
        System.out.println("Percentage:::" + venues5.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);

        Venues venues12 = new Venues();
        venues12.name = "O2 Academy Newcastle";
        venues12.maxCapacity = 2000;
        venues12.yearOfOpen = "1927";
        venues12.location = "Westgate Road, Newcastle Upon Tyne";
        venues12.concertsList = new ArrayList<>();
        venues12.concertsList.add(concerts);
        venues12.concertsList.add(concerts1);
        System.out.println("Percentage:::" + venues6.percentageCapacity(200, 1300));

        System.out.println("Venues ::" + venues2.concertsList);
        System.out.println("Venues ::" + venues2.concertsList);


////        to get average Venue attendance
//        int aveAttendance[] = {concerts.getAttendance(), concerts1.getAttendance(), concerts2.getAttendance(), concerts3.getAttendance(), concerts4.getAttendance()};
//
//        int sum = 0;
//        for (int i = 0; i < aveAttendance.length; i++)
//            sum += aveAttendance[i];
//
//        double average = ((double) sum) / aveAttendance.length;
//
//        System.out.println("Average :::" + average);
//    }


    }
}




