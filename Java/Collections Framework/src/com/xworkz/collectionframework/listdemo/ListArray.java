package com.xworkz.collectionframework.listdemo;

import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abhi");
        list.add("shek");
        list.add("vnith");
        list.add("ravi");
        list.add(null);
        list.add("vijay");
        System.out.println(list);
        System.out.println("*******************");
        System.out.println(list.get(3));
        System.out.println("*******************");
        Iterator<String > iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*********************");
        System.out.println(iterator);



    }
}
