package com.xworkz.collectionframework.arryalistdemo;

import com.xworkz.collectionframework.dto.MouseDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MouseList {
    List<MouseDTO> list = new ArrayList<MouseDTO>();

    public void addMouse(MouseDTO mouseDTO){
        list.add(mouseDTO);
    }

    public List<MouseDTO> getMouse(){
        return list;
    }

    public void displayMouse(){
//        System.out.println(list);
//        System.out.println("******************");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void ModifyMouse(int index,MouseDTO mouseDTO){
        list.set(index,mouseDTO);
    }

    public void removeMouse(int index){
        list.remove(index);

    }

    public void removeMouseByName(MouseDTO s){
        list.remove(s);
    }


}
