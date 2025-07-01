package com.xworkz.collection.external;

import java.util.*;

public class Friends {

    Collection<String> names = new ArrayList<String>();

    public void addName(String name){
            names.add(name);
    }

    public int length(){
       return names.size();
    }

    public void clear(){
        names.clear();
    }

}
