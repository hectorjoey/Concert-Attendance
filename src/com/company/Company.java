package com.company;

public class Company {

    public static void main(String[] args) {

        Concerts concerts0 = new Concerts(1, "Tom Walker", 700, 1, "12/12");
        Concerts concerts1 = new Concerts(2, "Grace Carter", 800, 2, "1/12");
        Concerts concerts2 = new Concerts(3, "Celine Dion", 1200, 1, "2/12");
        Concerts concerts3 = new Concerts(4, "Elton John", 800, 3, "3/12");
        Concerts concerts4 = new Concerts(5, "Sam Tompkins", 1300, 4, "4/12");
        Concerts concerts5 = new Concerts(6, "Beyonce", 1200, 4, "5/12");
        Concerts concerts6 = new Concerts(7, "Sam Fender", 1500, 3, "6/13");
        Concerts concerts7 = new Concerts(8, "Lil'Wayne", 2000, 4, "7/13");
        Concerts concerts8 = new Concerts(9, "Sam Smith", 570, 5, "8/12");
        Concerts concerts9 = new Concerts(10, "Adele", 1900, 6, "9/12");
        Concerts concerts10 = new Concerts(11, "Amy Winehouse", 12000, 7, "10/12");
        Concerts concerts11 = new Concerts(12, "Westlife", 700, 8, "11/12");
        Concerts concerts12 = new Concerts(13, "Elle Goulding", 2200, 9, "12/12");
        Concerts concerts13 = new Concerts(14, "Dua Lip", 900, 10, "1/13");
        Concerts concerts14 = new Concerts(15, "Dua Love", 2500, 6, "1/13");

        System.out.println("\n" + "\n" + "******* Venue0***********");

        //objects of venues0
        Venues venues0 = new Venues();
        venues0.Id = 1;
        venues0.name = "Arts Club Liverpool";
        venues0.capacity = 1300;
        venues0.yearOfOpen = "1800";
        venues0.location = "90 Seel Street, Liverpool";
        //list of concerts for venues
        venues0.concertsSet.add(concerts0);
        venues0.concertsSet.add(concerts2);
        System.out.println("List of Concerts objects in venue 0:: " + venues0.concertsSet + "\n");
        //percentage of capacity of concerts of venues0
        int percentageVenue = (concerts0.getAttendance() * 100) / venues0.capacity;

        if (percentageVenue >= 85) {
            System.out.println("Capacity warning triggered! for concert0 at venue 0" + "\n");
        } else {
            System.out.println("Capacity ok! for concert0 at venue with 0" + "\n");
        }
        System.out.println("Percentage of concert0 at venue 0:: " + percentageVenue + "%" + "\n");

        //percentage of capacity of concert2 of venues 0
        int percentage = (concerts2.getAttendance() * 100) / venues0.capacity;

        if (percentage >= 85) {
            System.out.println("Capacity warning triggered for concert2 at venue 0" + "\n");
        } else {
            System.out.println("Capacity ok! for  concert2 at venue 0" + "\n");
        }
        System.out.println("Percentage of Capacity for concert2 at venue 0 :: " + percentage + "%");

        //largest concerts in venues 0
        double[] numArrayVenues = {concerts0.getAttendance(), concerts2.getAttendance()};
        double largest = numArrayVenues[0];
        for (double num : numArrayVenues) {
            if (largest < num)
                largest = num;

        }
        System.out.format("Largest concerts in Venue 0 = %.2f", largest);

        //average attendance in venues 0
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 0");
        double[] numArray0 = {concerts0.getAttendance(), concerts2.getAttendance()};
        double sum0 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray0) {
            sum0 += num;
        }
        double average0 = sum0 / numArray0.length;
        System.out.format("\n" + "The Average attendance in venues0 is: %.2f", average0);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 1 ***********");
        //objects of venues1
        Venues venues1 = new Venues();
        venues1.Id = 2;
        venues1.name = "O2 ABC Glasgow";
        venues1.capacity = 1500;
        venues1.yearOfOpen = "1875";
        venues1.location = "300 Sauchiehall St, Glasgow";
        //list of concerts in venue 1
        venues1.concertsSet.add(concerts1);
        System.out.println("List of Concerts objects in venue 1:: " + venues1.concertsSet + "\n");
        //percentage of capacity of concert1 of venues1
        int percentageVenue1 = (concerts1.getAttendance() * 100) / venues1.capacity;

        if (percentageVenue1 >= 85) {
            System.out.println("Capacity warning triggered for concert1 at venue1" + "\n");
        } else {
            System.out.println("Capacity ok! for concert1 at venue1" + "\n");
        }

        System.out.println("Percentage of Concert 1 at venue1:: " + percentageVenue1 + "%" + "\n");

        //largest concerts in venues 1
        double[] numArrayVenues1 = {concerts1.getAttendance()};
        double largest1 = numArrayVenues1[0];
        for (double num : numArrayVenues1) {
            if (largest1 < num)
                largest1 = num;
        }
        System.out.format("Largest concerts in Venue 1 = %.2f", largest1);


        //average attendance in venues 1
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 1");
        double[] numArray1 = {concerts1.getAttendance()};
        double sum1 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray1) {
            sum1 += num;
        }
        double average1 = sum1 / numArray1.length;
        System.out.format("\n" + "The Average attendance in venues1 is: %.2f", average1);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 2***********");
        //objects of venues2
        Venues venues2 = new Venues();
        venues2.Id = 3;
        venues2.name = "O2 Academy Birmingham";
        venues2.capacity = 3009;
        venues2.yearOfOpen = "2009";
        venues2.location = "16-18 Horsefair, Birmingham";
        //list of concerts in venue 2
        venues2.concertsSet.add(concerts3);
        venues2.concertsSet.add(concerts6);

        System.out.println("List of Concerts objects in venue 2:: " + venues2.concertsSet);

        //percentage of capacity of concert3 of venues2
        int percentageVenue2 = (concerts3.getAttendance() * 100) / venues2.capacity;

        if (percentageVenue2 >= 85) {
            System.out.println("Capacity warning triggered for concert3 in venue 2" + "\n");
        } else {
            System.out.println("Capacity ok! for concert3 in venue 2" + "\n");
        }
        System.out.println("Percentage of concert 3 at venue 2:: " + percentageVenue2 + "%" + "\n");

        //percentage of capacity of concert6 of venues2
        int percentage21 = (concerts6.getAttendance() * 100) / venues2.capacity;

        if (percentage21 >= 85) {
            System.out.println("Capacity warning triggered for concert6 at venue2" + "\n");
        } else {
            System.out.println("Capacity ok! for concert6 at venue2 " + "\n");
        }
        System.out.println("Percentage for concert6 at venue2 :: " + percentage21 + "%" + "\n");

        //largest concerts in venues 2
        double[] numArrayVenues2 = {concerts3.getAttendance(), concerts6.getAttendance()};
        double largest2 = numArrayVenues2[0];
        for (double num : numArrayVenues2) {
            if (largest2 < num)
                largest2 = num;
        }
        System.out.format("Largest concerts in venue2 = %.2f", largest2);

        //average attendance in venues 2
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 2");
        double[] numArray2 = {concerts3.getAttendance(), concerts6.getAttendance()};
        double sum2 = 0.0;
        //System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray2) {
            sum2 += num;
        }
        double average2 = sum2 / numArray2.length;
        System.out.format("\n" + "The Average attendance in venues2 is: %.2f", average2);


        System.out.println("\n" + "\n" + "\n" + "******* VENUE 3***********");
        //objects of venues3
        Venues venues3 = new Venues();
        venues3.Id = 4;
        venues3.name = "O2 Academy Bournemouth";
        venues3.capacity = 5080;
        venues3.yearOfOpen = "1895";
        venues3.location = "16-18 Horsefair, Birmingham";
        //lists of Concerts in venues3
        venues3.concertsSet.add(concerts4);
        venues3.concertsSet.add(concerts5);
        venues3.concertsSet.add(concerts7);

        System.out.println("List of Concerts objects in venue 3:: " + venues3.concertsSet);

        //percentage of capacity of concert4 of venues3
        int percentageVenue3 = (concerts4.getAttendance() * 100) / venues3.capacity;

        if (percentageVenue3 >= 85) {
            System.out.println("Capacity warning triggered for concerts4 in venue3" + "\n");
        } else {
            System.out.println("Capacity ok! for concerts4 in venue3" + "\n");
        }
        System.out.println("Percentage of Concert 4:: " + percentageVenue3 + "%" + "\n");

        //percentage of capacity of concert5 of venues3
        int percentage3 = (concerts5.getAttendance() * 100) / venues3.capacity;

        if (percentage3 >= 85) {
            System.out.println("Capacity warning triggered for concerts5 in venue3" + "\n");
        } else {
            System.out.println("Capacity ok! for concerts5 in venue3" + "\n");
        }
        System.out.println("Percentage of Concert 5 :: " + percentage3 + "%" + "\n");

        //percentage of capacity of concert7 of venues3
        int percentage31 = (concerts7.getAttendance() * 100) / venues3.capacity;

        if (percentage31 >= 85) {
            System.out.println("Capacity warning triggered for concerts7 in venue3" + "\n");
        } else {
            System.out.println("Capacity ok! for concerts7 in venue3" + "\n");
        }
        System.out.println("Percentage of Concert 7:: " + percentage31 + "%" + "\n");

        //largest concerts in venues 3
        double[] numArrayVenues3 = {concerts4.getAttendance(), concerts5.getAttendance(), concerts7.getAttendance()};
        double largest3 = numArrayVenues3[0];
        for (double num : numArrayVenues3) {
            if (largest3 < num)
                largest3 = num;
        }
        System.out.format("Largest concerts in Venue3 = %.2f", largest3);

        //average attendance in venues 3
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 3");
        double[] numArray3 = {concerts4.getAttendance(), concerts5.getAttendance(), concerts7.getAttendance()};
        double sum3 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray3) {
            sum3 += num;
        }
        double average3 = sum3 / numArray3.length;
        System.out.format("The Average attendance in venues3 is: %.2f", average3);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 4***********");
        //objects of venues4
        Venues venues4 = new Venues();
        venues4.Id = 5;
        venues4.name = "O2 Academy Birmingham";
        venues4.capacity = 3009;
        venues4.yearOfOpen = "2009";
        venues4.location = "570 Christchurch Road, Boscombe";
        //list of concerts in venues 4
        venues4.concertsSet.add(concerts8);

        System.out.println("List of concerts objects of venue 4:: " + venues4.concertsSet);

        //percentage of capacity of concert8 of venues4
        int percentageVenue4 = (concerts8.getAttendance() * 100) / venues4.capacity;

        if (percentageVenue4 >= 85) {
            System.out.println("Capacity warning triggered for concert8 in venue4" + "\n");
        } else {
            System.out.println("Capacity ok! or concert8 in venue4 " + "\n");
        }
        System.out.println("Percentage of concert8 in venue4:: " + percentageVenue4 + "%" + "\n");

        //largest concerts in venues 4
        double[] numArrayVenues4 = {concerts8.getAttendance()};
        double largest4 = numArrayVenues4[0];
        for (double num : numArrayVenues4) {
            if (largest4 < num)
                largest4 = num;
        }
        System.out.format("Largest concerts in Venue4 = %.2f", largest4);

        //average attendance in venues 4
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 4");
        double[] numArray4 = {concerts8.getAttendance()};
        double sum4 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray4) {
            sum4 += num;
        }
        double average4 = sum4 / numArray4.length;
        System.out.format("\n" + "The Average attendance in venues4 is: %.2f", average4);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 5***********");
        //objects of venues5
        Venues venues5 = new Venues();
        venues5.Id = 6;
        venues5.name = "O2 Academy Bristol";
        venues5.capacity = 3400;
        venues5.yearOfOpen = "2001";
        venues5.location = "1-2 Frogmore Street, Bristol";
        //list of concerts in venue 5
        venues5.concertsSet.add(concerts9);

        System.out.println("List of Concerts objects for venue 5:: " + venues5.concertsSet);

        //percentage of capacity of concert9 of venues5
        int percentageVenue5 = (concerts9.getAttendance() * 100) / venues5.capacity;

        if (percentageVenue5 >= 85) {
            System.out.println("Capacity warning triggered for concert9 in venue5" + "\n");
        } else {
            System.out.println("Capacity ok! for concert9 in venue5" + "\n");
        }
        System.out.println("Percentage of concert 9:: " + percentageVenue5 + "%" + "\n");

        //largest concerts in venues 5
        double[] numArrayVenues5 = {concerts9.getAttendance()};
        double largest5 = numArrayVenues5[0];
        for (double num : numArrayVenues5) {
            if (largest5 < num)
                largest5 = num;
        }
        System.out.format("Largest concerts in venue5 = %.2f", largest5);

        //average attendance in venues 5
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 5");
        double[] numArray5 = {concerts9.getAttendance()};
        double sum5 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray5) {
            sum5 += num;
        }
        double average5 = sum5 / numArray5.length;
        System.out.format("\n" + "The Average attendance in venues5 is: %.2f", average5);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 6***********");
        //objects of venues6
        Venues venues6 = new Venues();
        venues6.Id = 7;
        venues6.name = "O2 Academy Brixton";
        venues6.capacity = 16012;
        venues6.yearOfOpen = "1929";
        venues6.location = "211 Stockwell Road, London";
        //list of concerts in venue 6
        venues6.concertsSet.add(concerts10);
        venues6.concertsSet.add(concerts14);
        System.out.println("List of Concerts objects for venue 6:: " + venues6.concertsSet);

        //percentage of capacity of concert10 of venues6
        int percentageVenue6 = (concerts10.getAttendance() * 100) / venues6.capacity;

        if (percentageVenue6 >= 85) {
            System.out.println("Capacity warning triggered for concert 10" + "\n");
        } else {
            System.out.println("Capacity ok! for concert 10" + "\n");
        }
        System.out.println("Percentage of concert 10:: " + percentageVenue6 + "%" + "\n");

        //percentage of capacity of concert14 of venues6
        int percentageVenue61 = (concerts14.getAttendance() * 100) / venues6.capacity;

        if (percentageVenue61 >= 85) {
            System.out.println("Capacity warning triggered for concert 14" + "\n");
        } else {
            System.out.println("Capacity ok! for concert 14" + "\n");
        }
        System.out.println("Percentage of concert 14:: " + percentageVenue61 + "%" + "\n");

        //largest concerts in venues 6
        double[] numArrayVenues6 = {concerts9.getAttendance()};
        double largest6 = numArrayVenues6[0];
        for (double num : numArrayVenues6) {
            if (largest6 < num)
                largest6 = num;
        }
        System.out.format("Largest concerts in venue6 = %.2f", largest6);

        //average attendance in venues 6
        System.out.println("AVERAGE ATTENDANCE IN VENUE 6");
        double[] numArray6 = {concerts10.getAttendance(), concerts14.getAttendance()};
        double sum6 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray6) {
            sum6 += num;
        }
        double average6 = sum6 / numArray6.length;
        System.out.format("\n" + "The Average attendance in venues6 is: %.2f", average6);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 7***********");
        //objects of venues7
        Venues venues7 = new Venues();
        venues7.Id = 8;
        venues7.name = "O2 Academy Islington";
        venues7.capacity = 1050;
        venues7.yearOfOpen = "1875";
        venues7.location = "16 Parkfield Street, London";
        //list of concerts in venues7
        venues7.concertsSet.add(concerts11);
        venues7.concertsSet.add(concerts13);

        System.out.println("List of concerts object in venue 7:: " + venues7.concertsSet);

        //percentage of capacity of concert11 of venues7
        int percentageVenue7 = (concerts11.getAttendance() * 100) / venues7.capacity;

        if (percentageVenue7 >= 85) {
            System.out.println("Capacity warning triggered for concert 11" + "\n");
        } else {
            System.out.println("Capacity ok! for concert 11" + "\n");
        }
        System.out.println("Percentage of concert 11:: " + percentageVenue7 + "\n");

        //percentage of capacity of concert13 of venues7
        int percentageVenue71 = (concerts13.getAttendance() * 100) / venues7.capacity;

        if (percentageVenue71 >= 85) {
            System.out.println("Capacity warning triggered for concert 13" + "\n");
        } else {
            System.out.println("Capacity ok! for concert13" + "\n");
        }
        System.out.println("Percentage of concert 13:: " + percentageVenue71 + "%" + "\n");

        //largest concerts in venues 7
        double[] numArrayVenues7 = {concerts11.getAttendance(), concerts13.getAttendance()};
        double largest7 = numArrayVenues7[0];
        for (double num : numArrayVenues7) {
            if (largest7 < num)
                largest7 = num;
        }
        System.out.format("\n" + "Largest concerts in venue7 = %.2f", largest7);

        //average attendance in venues 7
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 7");
        double[] numArray7 = {concerts11.getAttendance(), concerts13.getAttendance()};
        double sum7 = 0.0;
//        System.out.println("Number of Element:: " + numArray.length);
        for (double num : numArray7) {
            sum7 += num;
        }
        double average7 = sum7 / numArray7.length;
        System.out.format("\n" + "The Average attendance in venues7 is: %.2f", average7);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 8***********");
        //objects of venues8
        Venues venues8 = new Venues();
        venues8.Id = 9;
        venues8.name = "O2 Academy Leeds";
        venues8.capacity = 2300;
        venues8.yearOfOpen = "1885";
        venues8.location = "55 Cookridge Street, Leeds";
        //list of concerts in venues 8
        venues8.concertsSet.add(concerts12);

        System.out.println("List of concerts object for venue 8:: " + venues8.concertsSet);
        //percentage of capacity of concert12 of venues8
        int percentageVenue8 = (concerts12.getAttendance() * 100) / venues8.capacity;

        if (percentageVenue8 >= 85) {
            System.out.println("Capacity warning triggered for concert 12" + "\n");
        } else {
            System.out.println("Capacity ok! for concert 12" + "\n");
        }
        System.out.println("Percentage of concert 12:: " + percentageVenue8 + "%" + "\n");

        //largest concerts in venues 8
        double[] numArrayVenues8 = {concerts12.getAttendance()};
        double largest8 = numArrayVenues8[0];
        for (double num : numArrayVenues8) {
            if (largest8 < num)
                largest8 = num;
        }
        System.out.format("\n" + "Largest concerts in venue8 = %.2f", largest8);

        //average attendance in venues 8
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 8");
        double[] numArray8 = {concerts12.getAttendance()};
        double sum8 = 0.0;
        for (double num : numArray8) {
            sum8 += num;
        }
        double average8 = sum8 / numArray8.length;
        System.out.format("\n" + "The Average attendance in venues8 is: %.2f", average8);


        System.out.println("\n" + "\n" + "\n" + "******* Venue 9***********");
//        //objects of venues9
        Venues venues9 = new Venues();
        venues9.Id = 10;
        venues9.name = "O2 Academy Glasgow";
        venues9.capacity = 2600;
        venues9.yearOfOpen = "1921";
        venues9.location = "121 Eglinton Street, Glasgow";
        //list of concerts in venues 9
        venues9.concertsSet.add(concerts13);

        System.out.println("List of concerts objects for venue 9:: " + venues9.concertsSet);
        //percentage of capacity of concert13 of venues9
        int percentageVenue9 = (concerts13.getAttendance() * 100) / venues9.capacity;

        if (percentageVenue9 >= 85) {
            System.out.println("Capacity warning triggered for concert 13" + "\n");
        } else {
            System.out.println("Capacity ok! for concert 13" + "\n");
        }
        System.out.println("Percentage of concert 12:: " + percentageVenue9 + "%" + "\n");


        //largest concerts in venues 9
        double[] numArrayVenues9 = {concerts13.getAttendance()};
        double largest9 = numArrayVenues9[0];
        for (double num : numArrayVenues9) {
            if (largest9 < num)
                largest9 = num;
        }
        System.out.format("\n" + "Largest concerts in venue9 = %.2f", largest9);

        //average attendance in venues 9
        System.out.println("\n" + "AVERAGE ATTENDANCE IN VENUE 9");
        double[] numArray9 = {concerts13.getAttendance()};
        double sum9 = 0.0;
        for (double num : numArray9) {
            sum9 += num;
        }
        double average9 = sum9 / numArray9.length;
        System.out.format("\n" + "The Average attendance in venues8 is: %.2f", average9);

        //average attendance in venues
        double[] numArray = {concerts0.getAttendance(), concerts1.getAttendance(), concerts2.getAttendance(), concerts3.getAttendance(),
                concerts4.getAttendance(), concerts5.getAttendance(), concerts6.getAttendance(), concerts7.getAttendance(),
                concerts8.getAttendance(), concerts9.getAttendance(), concerts10.getAttendance(), concerts11.getAttendance(),
                concerts12.getAttendance(), concerts13.getAttendance(), concerts14.getAttendance()};
        double sum = 0.0;
        for (double num : numArray) {
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("\n" + "\n" + "The Average attendance in all venues is: %.2f", average);


        //The venue with the largest average concert attendance
        double[] numArrayAllVenues = {average0, average1, average2, average3, average4,
                average5, average6, average7, average8, average9};
        double largestVenues = numArrayAllVenues[0];
        for (double num : numArrayAllVenues) {
            if (largestVenues < num)
                largestVenues = num;
        }
        System.out.format("\n" + "The venue with the largest average concert attendance = %.2f", largest9);


        System.out.println("\n" + "A list of all concerts that have triggered the capacity warnings");
        //A list of all concerts that have triggered the capacity warnings
        int[] listOfHighCapacity = {percentageVenue, percentage, percentageVenue1, percentageVenue2, percentage21, percentageVenue3,
                percentage31, percentageVenue4, percentageVenue5, percentageVenue6, percentageVenue61, percentageVenue7, percentageVenue71,
                percentageVenue8, percentageVenue9};
        for (int aListOfHighCapacity : listOfHighCapacity) {
            if (aListOfHighCapacity >= 85) {
                System.out.print(aListOfHighCapacity + " ");

            }

        }

        //The venue with the fewest capacity warnings per year on average
        double[] fewCapacity = {concerts0.getAttendance(), concerts1.getAttendance(), concerts2.getAttendance(), concerts3.getAttendance(),
                concerts4.getAttendance(), concerts5.getAttendance(), concerts6.getAttendance(), concerts7.getAttendance(),
                concerts8.getAttendance(), concerts9.getAttendance(), concerts10.getAttendance(), concerts11.getAttendance(),
                concerts12.getAttendance(), concerts13.getAttendance(), concerts14.getAttendance()};
        double loweestVenues = numArrayAllVenues[0];
        for (double aFewCapacity : fewCapacity) {
            if (loweestVenues > aFewCapacity)
                loweestVenues = aFewCapacity;
        }
        System.out.format("\n" + "The venue with the fewest capacity warnings per year on average is: %.2f", loweestVenues);

    }

}
