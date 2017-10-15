package com.paulinefeytel;

public class Main {

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.setTheProcessor(new Processor("AMD", 2700, 389.90));
        myComputer.setTheHardDisk(new HardDisk("WD Blue", 7200,  59.90));
        myComputer.setTheDisplay(new Display("Dell", 12, 120.10));

        myComputer.printComputerSummary();
    }
}
