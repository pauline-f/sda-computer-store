package com.paulinefeytel;

public class Display {

    private String manufacturer;
    private int size;
    private double cost;

    public Display(String manufacturer, int size, double cost) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public void setCost(double newCost) {
        this.cost = newCost;
    }

    public void printDisplay() {
        System.out.println("Your display: Manufacturer: " + manufacturer + " Size: " + size + " Cost: " + cost);
    }

}
