package com.xworkz.collectionframework.iterator;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Courses {

    public static void main(String[] args) {
        List<String> courses = Arrays.asList("JAVA", "PYTHON", "C", "C++", "C#", "SQL");

//        basic for loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
        System.out.println("****************************");
//        enhanced for eachLoop
        for (String coursess : courses) {
            System.out.println(coursess);
        }
        System.out.println("*****************");
//        basic loop with iterator
        for (Iterator iterator = courses.iterator(); iterator.hasNext(); ) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
        System.out.println("*************************");
        Iterator<String> iterator1 = courses.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


//        java 8 with Stream + lamda example
        System.out.println("**********************useing stream*********************");
        courses.stream().forEach(c -> System.out.println(c));


//    java 8 forEach + lamda
        System.out.println("******************usimg forEach lamda *****************");
        courses.forEach(d -> System.out.println(d));

    }
}
