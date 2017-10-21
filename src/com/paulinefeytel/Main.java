package com.paulinefeytel;

public class Main {

    public static void main(String[] args) {
        // create a new list
        ComputerStore listComputer = new ComputerStore();

        // create a new computer
        Computer myComputer = new Computer();
        myComputer.setTheProcessor(new Processor("AMD", 2700, 389.90));
        myComputer.setTheHardDisk(new HardDisk("WD Blue", 7200,  59.90));
        myComputer.setTheDisplay(new Display("Dell", 12, 120.10));

        // create a new computer
        Computer myComputer2 = new Computer();
        myComputer2.setTheProcessor(new Processor("Intel", 2700, 429.90));
        myComputer2.setTheHardDisk(new HardDisk("WD Blue", 7200,  98.90));
        myComputer2.setTheDisplay(new Display("Apple", 12, 150.10));

        // create a new computer
        Computer myComputer3 = new Computer();
        myComputer3.setTheProcessor(new Processor("Sun", 2700, 289.90));
        myComputer3.setTheHardDisk(new HardDisk("WD Blue", 7200,  49.90));
        myComputer3.setTheDisplay(new Display("Samsung", 12, 110.10));

        // add computers in the list
        listComputer.addComputer(myComputer);
        listComputer.addComputer(myComputer2);
        listComputer.addComputer(myComputer3);

        System.out.println("The computer the most expensive is:");
        listComputer.findMostExpensiveComputerV1().printComputerSummary();
        listComputer.findMostExpensiveComputerV2().printComputerSummary();
        listComputer.findMostExpensiveComputerV3().printComputerSummary();
        listComputer.findMostExpensiveComputerV4().printComputerSummary();
    }
}
