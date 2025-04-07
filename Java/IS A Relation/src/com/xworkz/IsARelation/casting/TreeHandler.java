package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.MangoTree;
import com.xworkz.IsARelation.internal.Tree;

public class TreeHandler {

        public TreeHandler() {
            System.out.println("TreeHandler Constructor");
        }

        public void handleTree(Tree tree) {
            if (tree != null) {
                tree.grow();
                tree.photosynthesize();
                tree.absorbWater();
                tree.provideOxygen();
                tree.shedLeaves();

                if (tree instanceof MangoTree) {
                    MangoTree mangoTree = (MangoTree) tree;
                    mangoTree.bearFruit(); // Specific to MangoTree
                } else {
                    System.out.println("The tree is not a MangoTree.");
                }
            }
        }


}
