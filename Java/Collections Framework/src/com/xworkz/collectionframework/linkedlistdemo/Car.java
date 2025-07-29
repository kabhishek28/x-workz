package com.xworkz.collectionframework.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Car {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Maruthi");
        list.add("GT");
        list.add("Defender");
        list.add("jagvar");
        System.out.println("*******************************************");
        System.out.println(list);
        System.out.println("*******************************************");

//        to add
        list.add(2,"range rover");
        System.out.println(list);

//        add at first of linkedlist

        list.addFirst("skoda");
        System.out.println("*******************************************");

        System.out.println(list);
        System.out.println("*******************************************");

        list.addLast("tata");
        System.out.println(list);
        System.out.println("*******************************************");

//        how to get linked list
        System.out.println("get the first element in linked list :" + list.getFirst());
        System.out.println("*******************************************");

        System.out.println("get the last element in linked list :" + list.getLast());
        System.out.println("*******************************************");

        System.out.println("get the at index based element in linked list :" + list.get(4));
        System.out.println("*******************************************");

        for(String car : list){
            System.out.println(car);
        }
        System.out.println("*******************************************");

// remove element in linked list
        System.out.println(list);
        System.out.println("*******************************************");

        System.out.println("removing first element in linked list :"  + list.removeFirst());
        System.out.println(list);
        System.out.println("*******************************************");

        System.out.println("removing last element in linked list :"  + list.removeLast());
        System.out.println(list);
        System.out.println("*******************************************");


        System.out.println("removing  element index base in linked list :"  + list.remove(4));
        System.out.println(list);
        System.out.println("*******************************************");

        System.out.println("befor clear");
        System.out.println(list);
        System.out.println("*******************************************");

        list.clear();
        System.out.println("after clear");


        System.out.println(list);
        System.out.println("*******************************************");

//      Search in linked list
        System.out.println("*********************************");

        list.add("Maruthi");
        list.add("GT");
        list.add("Defender");
        list.add("jagvar");
        list.add("Defender");
        list.add("tata");

        boolean find = list.contains("tata");
        System.out.println("find tata in list :"+find);
        System.out.println("*******************************************");
        System.out.println("index of method :  " + list.indexOf("Defender"));

        System.out.println("*******************************************");
        System.out.println("index of method :  " + list.lastIndexOf("Defender"));

        System.out.println("*******************************************");
// iterator in linked list
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator method : " + iterator.next());
        }
        System.out.println("*******************************************");
//        foreach

        list.forEach(e-> System.out.println(e));
        System.out.println("*******************************************");
//        for each advanced loop
        for(String e : list){
            System.out.println(e);
        }
        System.out.println("*******************************************");
//        simple for loop

        for(int  i = 0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }




    }
}
