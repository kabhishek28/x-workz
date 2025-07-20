package com.xworkz.collectionframework.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Abhi");
        collection.add("vinith");
        collection.add("ravi");
        System.out.println("Printing collection : " + collection);
//        collection.clear();
//        System.out.println(collection);
        System.out.println("IF Abhi contains in collection :" + collection.contains("Abhi"));
        System.out.println("Equals method :" + collection.equals("ravi"));
        System.out.println("hashcode : " + collection.hashCode());
        System.out.println("Collection is empty : " + collection.isEmpty());
        collection.remove("Removeing the Abhi : "+ "Abhi");
        System.out.println("Printing collection : " + collection);
        Iterable<String > iterable = new ArrayList<>();
        System.out.println("Iterator : " + collection.iterator());
        System.out.println("Colllectio size :" + collection.size());
        collection.clear();
        System.out.println("after Clearig collection :" + collection);


    }
}
