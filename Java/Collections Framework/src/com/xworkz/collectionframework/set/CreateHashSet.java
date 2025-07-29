package com.xworkz.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CreateHashSet {
    public static void main(String[] args) {
        Set<String> programmingLanguage = new HashSet<>();
        programmingLanguage.add("java");
        programmingLanguage.add("python");
        programmingLanguage.add("C");
        programmingLanguage.add("C++");
        programmingLanguage.add("C#");
        System.out.println("****************************************");
        System.out.println(programmingLanguage );
        System.out.println("****************************************");
        programmingLanguage.add("java");
        System.out.println(programmingLanguage );

//        using remove () method
        System.out.println("****************************************");
        boolean ans = programmingLanguage.remove("C++");
        System.out.println(ans);
        System.out.println("****************************************");
        System.out.println(programmingLanguage);


//        Iterator
        System.out.println("****************************************");
//        enhanced for loop
        for(String pro : programmingLanguage){
            System.out.println(pro);
        }
        System.out.println("****************************************");
//        basic loop with iterator
        for(Iterator<String > iterator = programmingLanguage.iterator(); iterator.hasNext();){
            String prolang = (String) iterator.next();
            System.out.println(prolang);
        }
        System.out.println("****************************************");
//        while loop with Iterator
        Iterator<String > iterator = programmingLanguage.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*************    for each    ***************************");
//        jdk 8 forEach method with lamda
        programmingLanguage.forEach(e-> System.out.println(e));
        System.out.println("***************----------------------********************");

        programmingLanguage
                .stream()
                .filter(p->!"java".equals(p))
                .forEach(p-> System.out.println(p));

    }
}
