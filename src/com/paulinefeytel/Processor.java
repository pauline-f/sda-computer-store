package com.paulinefeytel;

public class Processor {

    private String manufacturer;
    private int clockSpeed;
    private double cost;

    public Processor(String manufacturer, int clockSpeed, double cost) {
        this.manufacturer = manufacturer;
        this.clockSpeed = clockSpeed;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public double getCost() {
        return cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     *  print a summary for the processor
     */
    public void printProcessor() {
        System.out.println("Your processor: Manufacturer: " + manufacturer + " clock speed: " + clockSpeed + " Cost: " + cost);
    }

}
