package com.xworkz.collectionframework.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("1GB" , 200);
        map.put("1.5GB",249);
        map.put("2GB" , 299);
        map.put("2.5GB" , 349);
        map.put(null,500);

        System.out.println(map);

        System.out.println(map.isEmpty());

        System.out.println(map.size());

//check if key exists in the hashmap
        if(map.containsKey("1GB")){
            System.out.println("Exist");
        }else{
            System.out.println("Not exist");
        }


        if(map.containsValue(500)){
            System.out.println("Exist");
        }else{
            System.out.println("Not exist");
        }

//        get values by key
        Integer v = map.get("2.5GB");
        System.out.println(v);

//        how to remove keys from hashmap
        map.remove("2GB");
        System.out.println(map);


//        get only keys from hashmap

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.values());


//        iterator

//        for each
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("key -> " + entry.getKey() + "value -> " + entry.getValue());
        }

//        using iterator
        Set<Map.Entry<String ,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("key -> " + entry.getKey() + "value -> " + entry.getValue());
        }

//        hashMap using java 8 foreach

        map.forEach((K ,V) -> {
            System.out.print("K -> " + K);
            System.out.println(" --- V -> " + V);
        });

    }
}
