package com.xworkz.object.runner;

import com.xworkz.object.external.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MugRunner {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.xworkz.object.external.Mug");
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            Mug mug = (Mug)  constructor.newInstance();
            mug.checkMugIsFullORNot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
