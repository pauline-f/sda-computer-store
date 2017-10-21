package com.paulinefeytel;

public class HardDisk {

    private String manufacturer;
    private int speed;
    private double cost;

    public HardDisk(String manufacturer, int speed, double cost) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public double getCost() {
        return cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     *  print a summary for the hard disk
     */
    public void printHardDisk() {
        System.out.println("Your hard disk: Manufacturer: " + manufacturer + " Speed: " + speed + " Cost: " + cost);
    }
}


