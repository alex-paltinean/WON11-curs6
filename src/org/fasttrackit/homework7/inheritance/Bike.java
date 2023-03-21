package org.fasttrackit.homework7.inheritance;

public class Bike extends Object{
    protected final static int MAX_PRESSURE = 10;
    protected int tyrePressure;
    private int speed;

    public BikeWheel bikeWheel = new BikeWheel();

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int amount, byte a) {
        this.speed += amount;
    }

    public void increaseSpeed(byte multiplier, int a){
        this.speed = this.speed * multiplier;
    }

    public void increaseSpeed(){
        this.speed++;
    }

    public void stop() {
        this.speed = 0;
    }

    public void flatTyre() {
        System.out.println("Opps, my bike got a flat tire!");
        this.tyrePressure = 0;
    }

    public void inflateTyre(int amount) {
        tyrePressure += amount;
        if (tyrePressure > MAX_PRESSURE) {
            flatTyre();
        }
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    public int getSpeed() {
        return speed * bikeWheel.size;
    }

    private class BikeWheel {
        private int size;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}

