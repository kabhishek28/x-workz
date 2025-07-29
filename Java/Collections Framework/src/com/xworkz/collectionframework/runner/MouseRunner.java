package com.xworkz.collectionframework.runner;

import com.xworkz.collectionframework.arryalistdemo.MouseList;
import com.xworkz.collectionframework.dto.MouseDTO;

import java.util.List;

public class MouseRunner {
    public static void main(String[] args) {
        MouseDTO mouseDTO = new MouseDTO("DEll" , 250);
        MouseDTO mouseDTO1 = new MouseDTO("lenova" , 300);
        MouseDTO mouseDTO2 = new MouseDTO("asus" , 200);
        MouseDTO mouseDTO3 = new MouseDTO("macbook" , 500);
        MouseDTO mouseDTO4 = new MouseDTO("HP" , 100);

        MouseList mouseList = new MouseList();
        mouseList.addMouse(mouseDTO);
        mouseList.addMouse(mouseDTO1);
        mouseList.addMouse(mouseDTO2);
        mouseList.addMouse(mouseDTO3);
        mouseList.addMouse(mouseDTO4);
        System.out.println("***********************");
        mouseList.displayMouse();
        System.out.println("*************************");
        List<MouseDTO> list = mouseList.getMouse();
        System.out.println(list);
        System.out.println("***************************");
        mouseList.ModifyMouse(4,mouseDTO2);
        mouseList.displayMouse();
        System.out.println("removeing mouse ****************");
        mouseList.removeMouse(4);
        mouseList.displayMouse();
        System.out.println("**************************/");
        mouseList.removeMouseByName( mouseDTO1);
        mouseList.displayMouse();

    }
}
