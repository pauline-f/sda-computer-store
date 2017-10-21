package com.paulinefeytel;

public class Computer {

    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;

    public Computer() {
    }

    public Processor getTheProcessor() {
        return theProcessor;
    }

    public void setTheProcessor(Processor theProcessor) {
        this.theProcessor = theProcessor;
    }

    public HardDisk getTheHardDisk() {
        return theHardDisk;
    }

    public void setTheHardDisk(HardDisk theHardDisk) {
        this.theHardDisk = theHardDisk;
    }

    public Display getTheDisplay() {
        return theDisplay;
    }

    public void setTheDisplay(Display theDisplay) {
        this.theDisplay = theDisplay;
    }

    // sum total cost for a computer
    public double sumTotalCost() {
        return theDisplay.getCost() + theProcessor.getCost() + theHardDisk.getCost();
    }

    /**
     *  print a summary of the Computer components and calculate the total cost
     */
    public void printComputerSummary() {
        System.out.println("Your computer:");
        theDisplay.printDisplay();
        theHardDisk.printHardDisk();
        theProcessor.printProcessor();

        System.out.println("Total cost: " + sumTotalCost());
    }
}
