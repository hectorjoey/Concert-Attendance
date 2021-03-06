package com.company;

public class Company {

    public static void main(String[] args) {
        Concerts concerts = new Concerts(1, "Tom Walker", 1200, 1, "12/12");
        Concerts concerts1 = new Concerts(2, "Grace Carter", 800, 2, "1/12");
        Concerts concerts2 = new Concerts(3, "Celine Dion", 1200, 1, "2/12");
        Concerts concerts3 = new Concerts(4, "Elton John", 2500, 3, "3/12");
        Concerts concerts4 = new Concerts(5, "Sam Tompkins", 2500, 4, "4/12");
        Concerts concerts5 = new Concerts(6, "Beyonce", 2500, 4, "5/12");
        Concerts concerts6 = new Concerts(7, "Sam Fender", 25000, 3, "6/12");
        Concerts concerts7 = new Concerts(8, "Lil'Wayne", 2500, 4, "7/12");
        Concerts concerts8 = new Concerts(9, "Sam Smith", 1670, 5, "8/12");
        Concerts concerts9 = new Concerts(10, "Adele", 2900, 6, "9/12");
        Concerts concerts10 = new Concerts(11, "Amy Winehouse", 12000, 7, "10/12");
        Concerts concerts11 = new Concerts(12, "Westlife", 700, 8, "11/12");
        Concerts concerts12 = new Concerts(13, "Elle Goulding", 1800, 9, "12/12");
        Concerts concerts13 = new Concerts(14, "Dua Lip", 900, 10, "1/13");


        //objects of venues
        Venues venues = new Venues();
        venues.Id = 1;
        venues.name = "Arts Club Liverpool";
//        venues.capacity = 1200;
        venues.maxCapacity = 1300;
        venues.yearOfOpen = "1800";
        venues.location = "90 Seel Street, Liverpool";
//        array list of concerts
        venues.concertsSet.add(concerts);
        venues.concertsSet.add(concerts2);

        //percentage of capacity of concerts of venues
        int percentageVenue = (concerts.getAttendance() * 100) / venues.maxCapacity;

        if (percentageVenue >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage of Concerts:: " + percentageVenue + "%");

//percentage of capacity of concert2 of venues
        int percentage = (concerts2.getAttendance() * 100) / venues.maxCapacity;

        if (percentage >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage of Concert 2:: " + percentage + "%");


        //objects of venues1
        Venues venues1 = new Venues();
        venues1.Id = 2;
        venues1.name = "O2 ABC Glasgow";
        venues1.maxCapacity = 1300;
        venues1.capacity = 800;
        venues1.yearOfOpen = "1875";
        venues1.location = "300 Sauchiehall St, Glasgow";
        //list of concerts in venue 1
        venues1.concertsSet.add(concerts1);

//percentage of capacity of concert1 of venues1
        int percentageVenue1 = (concerts1.getAttendance() * 100) / venues.maxCapacity;

        if (percentageVenue1 >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }

        System.out.println("Percentage of Concert 1:: " + percentageVenue1 + "%");

        //objects of venues2
        Venues venues2 = new Venues();
        venues2.Id = 3;
        venues2.name = "O2 Academy Birmingham";
        venues2.maxCapacity = 3009;
        venues2.capacity = 2500;
        venues2.yearOfOpen = "2009";
        venues2.location = "16-18 Horsefair, Birmingham";
        //list of concerts in venue 2
        venues2.concertsSet.add(concerts3);
        venues2.concertsSet.add(concerts6);

        System.out.println("List of Concerts in venue 2:: " + venues2.concertsSet);

        //percentage of capacity of concert3 of venues2
        int percentageVenue2 = (concerts3.getAttendance() * 100) / venues.maxCapacity;

        if (percentageVenue2 >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage:: " + percentageVenue2 + "%");

//percentage of capacity of concert6 of venues2
        int percentage1 = (concerts2.getAttendance() * 100) / venues.maxCapacity;

        if (percentage1 >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage of Concert 2:: " + percentage1 + "%");


        //objects of venues3
        Venues venues3 = new Venues();
        venues3.Id = 4;
        venues3.name = "O2 Academy Bournemouth";
        venues3.capacity = 2500;
        venues3.maxCapacity = 5080;
        venues3.yearOfOpen = "1895";
        venues3.location = "16-18 Horsefair, Birmingham";
        //lists of Concerts in venues3
        venues3.concertsSet.add(concerts4);
        venues3.concertsSet.add(concerts5);
        venues3.concertsSet.add(concerts7);

        System.out.println("List of Concerts:: " + venues3.concertsSet);

        //percentage of capacity of concert4 of venues3
        int percentageVenue3 = (concerts4.getAttendance() * 100) / venues.maxCapacity;

        if (percentageVenue3 >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage:: " + percentageVenue3 + "%");

//percentage of capacity of concert5 of venues3
        int percentage3 = (concerts5.getAttendance() * 100) / venues.maxCapacity;

        if (percentage3 >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage of Concert 2:: " + percentage3 + "%");

        //percentage of capacity of concert7 of venues3
        int percentage31 = (concerts5.getAttendance() * 100) / venues.maxCapacity;

        if (percentage31 >= 85) {
            System.out.println("Capacity warning triggered");
        } else {
            System.out.println("Capacity ok!");
        }
        System.out.println("Percentage of Concert 2:: " + percentage31 + "%");


        //objects of venues4
        Venues venues4 = new Venues();
        venues.Id = 5;
        venues4.name = "O2 Academy Birmingham";
        venues4.maxCapacity = 3009;
        venues4.capacity = 1670;
        venues4.yearOfOpen = "2009";
        venues4.location = "570 Christchurch Road, Boscombe";
        //list of concerts in venues 4
        venues4.concertsSet.add(concerts8);

        System.out.println("List of Concerts:: " + venues4.concertsSet);


        Venues venues5 = new Venues();
        venues5.Id = 6;
        venues5.name = "O2 Academy Bristol";
        venues5.maxCapacity = 3400;
        venues5.capacity = 2900;
        venues5.yearOfOpen = "2001";
        venues5.location = "1-2 Frogmore Street, Bristol";
        venues5.concertsSet.add(concerts9);

        System.out.println("List of Concerts:: " + venues5.concertsSet);
        System.out.println("Percentage:: " + venues5.percentageCapacity(venues5.capacity, venues5.maxCapacity));

//
        Venues venues6 = new Venues();
        venues6.Id = 7;
        venues6.name = "O2 Academy Brixton";
        venues6.maxCapacity = 16012;
        venues6.capacity = 12000;
        venues6.yearOfOpen = "1929";
        venues6.location = "211 Stockwell Road, London";

        venues6.concertsSet.add(concerts10);
        System.out.println("List of Concerts:: " + venues6.concertsSet);
        System.out.println("Percentage:: " + venues6.percentageCapacity(venues6.capacity, venues6.maxCapacity));


        Venues venues7 = new Venues();
        venues7.Id = 8;
        venues7.name = "O2 Academy Islington";
        venues7.maxCapacity = 1050;
        venues7.capacity = 700;
        venues7.yearOfOpen = "1875";
        venues7.location = "16 Parkfield Street, London";

        venues7.concertsSet.add(concerts11);

        venues7.concertsSet.add(concerts10);
        System.out.println("List of Concerts:: " + venues7.concertsSet);
        System.out.println("Percentage:: " + venues7.percentageCapacity(venues7.capacity, venues7.maxCapacity));


        Venues venues8 = new Venues();
        venues8.Id = 9;
        venues8.name = "O2 Academy Leeds";
        venues8.maxCapacity = 2300;
        venues8.capacity = 1800;
        venues8.yearOfOpen = "1885";
        venues8.location = "55 Cookridge Street, Leeds";
        venues8.concertsSet.add(concerts12);

        System.out.println("List of Concerts:: " + venues8.concertsSet);
        System.out.println("Percentage:: " + venues8.percentageCapacity(venues8.capacity, venues8.maxCapacity));
//
        Venues venues9 = new Venues();
        venues9.Id = 10;
        venues9.name = "O2 Academy Glasgow";
        venues9.maxCapacity = 2600;
        venues9.capacity = 900;
        venues9.yearOfOpen = "1921";
        venues9.location = "121 Eglinton Street, Glasgow";

        venues9.concertsSet.add(concerts13);

        System.out.println("List of Concerts:: " + venues9.concertsSet);
        System.out.println("Percentage:: " + venues9.percentageCapacity(venues9.capacity, venues9.maxCapacity));

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
}