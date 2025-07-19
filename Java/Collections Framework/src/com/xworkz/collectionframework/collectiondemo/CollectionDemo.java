package com.xworkz.collectionframework.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Abhi");
        collection.add("vinith");
        collection.add("ravi");
        System.out.println(collection);
//        collection.clear();
        System.out.println(collection);
        System.out.println(collection.contains("Abhi"));
        System.out.println(collection.equals("ravi"));
        System.out.println("hashcode :" + collection.hashCode());
        System.out.println(collection.isEmpty());
        collection.remove("Abhi");
        System.out.println(collection);
        System.out.println(collection.iterator());
        System.out.println(collection.size());

    }

}
