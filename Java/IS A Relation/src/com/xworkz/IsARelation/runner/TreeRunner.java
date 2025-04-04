package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.MangoTree;
import com.xworkz.IsARelation.internal.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new MangoTree();
        tree.grow();
        tree.photosynthesize();
        tree.absorbWater();
        tree.provideOxygen();
        tree.shedLeaves();

        System.out.println("******************");

        MangoTree mangoTree = new MangoTree();
        mangoTree.grow();
        mangoTree.photosynthesize();
        mangoTree.absorbWater();
        mangoTree.provideOxygen();
        mangoTree.shedLeaves();
    }
}
