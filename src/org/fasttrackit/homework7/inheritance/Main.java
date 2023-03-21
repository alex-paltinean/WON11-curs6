package org.fasttrackit.homework7.inheritance;

import org.fasttrackit.homework7.inheritance.mountain.MountainBike;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bike:");
        Bike bike = new Bike(3);
        System.out.println(bike.getTyrePressure());
        bike.inflateTyre(6);
        System.out.println(bike.getTyrePressure());
        bike.inflateTyre(2);
        System.out.println(bike.getTyrePressure());

        System.out.println("Mountain bike:");
        MountainBike mountainBike = new MountainBike();
        System.out.println(mountainBike.getTyrePressure());
        mountainBike.inflateTyre(100);
        System.out.println(mountainBike.getTyrePressure());
        System.out.println(mountainBike);

        System.out.println("City bike;");
        CityBike cityBike = new CityBike(9);
        System.out.println(cityBike.getTyrePressure());

        System.out.println("Array example:");
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike(5);
        bikes[1] = new MountainBike();
        bikes[2] = new CityBike(9);

        Random r = new Random();
        for (Bike b : bikes) {
            b.inflateTyre(100);
            System.out.println(b.getTyrePressure());
            b.increaseSpeed((byte) 23, 1);
            System.out.println(b.getSpeed());
        }
    }
}
