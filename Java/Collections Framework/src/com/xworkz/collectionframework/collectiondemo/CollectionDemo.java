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
        collection.remove( "Abhi");
        System.out.println("Printing collection : " + collection);
//        Iterable<String > iterable = new ArrayList<>();
//        System.out.println("Iterator : " + collection.iterator());
        System.out.println("Colllectio size :" + collection.size());
//        collection.clear();
        System.out.println("after Clearig collection :" + collection);

Collection<String> collection1 = new ArrayList<>();
collection1.add("vinutha");
collection1.add("reka");
collection1.add("roopa");
//collection.addAll(collection1);
        System.out.println("collection1 : " + collection1);
        System.out.println("collection : "+ collection);

        System.out.println("cheking if both collection are equals are not :" + collection.equals(collection1));
        System.out.println("checking if collection containes collection1 : " + collection.contains(collection1));
        collection.add("vinutha");
        collection.add("reka");
        collection.add("roopa");
        System.out.println(collection);
        System.out.println("checking if collection containes collection1 : " + collection.containsAll(collection1));
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println("using Iterator : " + iterator.next());
        }

    }
}
