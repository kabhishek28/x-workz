package com.xworkz.collection.runner;

import com.xworkz.collection.external.Friends;

import java.util.Scanner;

public class CollectionRunner {
    public static void main(String[] args) {
        Friends friend1 = new Friends();
        Scanner scanner = new Scanner(System.in);
        System.out.println("first time enter the 10 name");
        for(int i = 0 ; i < 10 ; i++){
            String peru = scanner.nextLine();
            friend1.addName(peru);
        }
        System.out.println("first time length of the friend1 :"+ friend1.length());
        friend1.clear();
        System.out.println("After the  clear method called size of the friend1 :"+ friend1.length());
        System.out.println("second time enter the 10 name");
        for(int i = 0 ; i < 10 ; i++){
            String peru = scanner.nextLine();
            friend1.addName(peru);
        }
        System.out.println("second time length of the friend1 :"+ friend1.length());
    }
}