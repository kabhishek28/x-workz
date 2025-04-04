package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SuperQuantumComputer;
import com.xworkz.IsARelation.internal.QuantumComputer;

public class QuantumComputerRunner {
    public static void main(String[] args) {
        QuantumComputer quantum = new SuperQuantumComputer();
        quantum.performQuantumCalculation();
        quantum.processQubits();
        quantum.optimizeAlgorithms();
        quantum.runQuantumSimulation();
        quantum.encryptData();

        System.out.println("******************");

        SuperQuantumComputer superQuantum = new SuperQuantumComputer();
        superQuantum.performQuantumCalculation();
        superQuantum.processQubits();
        superQuantum.optimizeAlgorithms();
        superQuantum.runQuantumSimulation();
        superQuantum.encryptData();
    }
}
