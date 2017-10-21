package com.paulinefeytel;

import java.util.ArrayList;
import java.util.Iterator;

public class ComputerStore {
    private ArrayList<Computer> computers;

    public ComputerStore() {
        computers = new ArrayList<>();
    }

    public boolean addComputer(Computer newComputer) {
        return computers.add(newComputer);
    }

    public boolean removeComputer(int index) {
        if (index >= 0 && index < computers.size()) {
            computers.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

    // prints out all the details of each computer in store
    public void printAllComputers( ) {
        for (Computer computer: computers) {
            computer.printComputerSummary();
        }
    }

    // prints the total cost for all computers
    public void printTotalValue( ) {
        int sumTotal = 0;
        for (Computer computer : computers) {
            sumTotal += computer.sumTotalCost();
        }
        System.out.println("Total cost for all computers: " + sumTotal);
    }

    // This version will use a traditional for loop
    public Computer findMostExpensiveComputerV1() {
        Computer currentMostExpensive = null;
        double costMostExpensive = 0;
        for (int i = 0; i < computers.size(); i++) {
            Computer computer = computers.get(i);
            double totalCost = computer.sumTotalCost();
            if (totalCost > costMostExpensive) {
                costMostExpensive = totalCost;
                currentMostExpensive = computer;
            }
        }
        return currentMostExpensive;
    }

    // This version will use a traditional while loop
    public Computer findMostExpensiveComputerV2() {
        Computer currentMostExpensive = null;
        double costMostExpensive = 0;

        int i = 0;
        while (i < computers.size()) {
            Computer computer = computers.get(i);
            double totalCost = computer.sumTotalCost();
            if (totalCost > costMostExpensive) {
                costMostExpensive = totalCost;
                currentMostExpensive = computer;
            }
            i++;
        }
        return currentMostExpensive;
    }

    // This version will use a for-each loop
    // I prefer this loop because there is no index, we manipulate the instance directly and the syntax is simpler
    public Computer findMostExpensiveComputerV3() {
        Computer currentMostExpensive = null;
        double costMostExpensive = 0;

        for (Computer computer: computers) {
            double totalCost = computer.sumTotalCost();
            if (totalCost > costMostExpensive) {
                costMostExpensive = totalCost;
                currentMostExpensive = computer;
            }
        }
        return currentMostExpensive;
    }

    // This version will use an Iterator object with a while loop
    public Computer findMostExpensiveComputerV4() {
        Computer currentMostExpensive = null;
        double costMostExpensive = 0;
        Iterator <Computer> it = computers.iterator();
        while (it.hasNext()) {
            Computer computer = it.next();
            double totalCost = computer.sumTotalCost();
            if (totalCost > costMostExpensive) {
                costMostExpensive = totalCost;
                currentMostExpensive = computer;
            }
        }
        return currentMostExpensive;
    }
}

