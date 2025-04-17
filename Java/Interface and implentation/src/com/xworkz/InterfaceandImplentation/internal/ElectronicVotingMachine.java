package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.VotingMachine;

public class ElectronicVotingMachine implements VotingMachine {
    @Override
    public void castVote() {
        System.out.println("Vote cast via electronic voting machine.");
    }

    @Override
    public void tallyVotes() {
        System.out.println("Tallying votes across all polling stations.");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating election report.");
    }
}