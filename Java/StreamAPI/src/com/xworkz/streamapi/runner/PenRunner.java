package com.xworkz.streamapi.runner;

import com.xworkz.streamapi.external.Pen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Stream<String> stream = Stream.of("ball","gel");
        stream.forEach(System.out::println);

        Collection<String> collection =new ArrayList<>();
        collection.add("Abhi");
        collection.add("vinith");
        collection.add("vijiya");
        collection.add("manju");
        collection.stream().forEach(s -> System.out.println(s));
    }
}
