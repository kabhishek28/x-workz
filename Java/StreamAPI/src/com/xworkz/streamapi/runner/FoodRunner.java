package com.xworkz.streamapi.runner;

import com.xworkz.streamapi.external.Food;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FoodRunner {
    public static void main(String[] args) {
        List<Food> list = new ArrayList<>();
        list.add(new Food("biriyani", 250));
        list.add(new Food("paneer", 120));
        list.add(new Food("pizza", 180));
        list.add(new Food("burger", 90));
        list.add(new Food("pasta", 150));
        list.add(new Food("fried rice", 140));
        list.add(new Food("noodles", 130));
        list.add(new Food("dosa", 80));
        list.add(new Food("idli", 60));
        list.add(new Food("manchurian", 110));
        list.add(new Food("tandoori chicken", 270));
        list.add(new Food("chole bhature", 100));
        list.add(new Food("samosa", 40));
        list.add(new Food("vada pav", 30));
        list.add(new Food("momos", 70));
        list.add(new Food("butter chicken", 260));
        list.add(new Food("chicken curry", 240));
        list.add(new Food("rajma chawal", 110));
        list.add(new Food("fish fry", 220));
        list.add(new Food("egg curry", 130));
        list.add(new Food("paratha", 50));
        list.add(new Food("poha", 40));
        list.add(new Food("upma", 45));
        list.add(new Food("kachori", 35));
        list.add(new Food("aloo tikki", 55));
        list.add(new Food("spring roll", 90));
        list.add(new Food("malai kofta", 160));
        list.add(new Food("dal makhani", 140));
        list.add(new Food("palak paneer", 150));
        list.add(new Food("mushroom masala", 145));


//        for (Food food : list){
//            if(food.getPrice() > 200){
//                System.out.println(food.getName() +"--->"+food.getPrice());
//            }
//        }

        List<Food> foodList = list.stream().filter(l->l.getPrice() > 200).collect(Collectors.toList());
        System.out.println("************");
        foodList.stream().forEach(food -> System.out.println(food.getName()+"-->"+food.getPrice()));

        System.out.println("********************************");
        list.stream().filter(l->l.getPrice() > 200).forEach(food -> System.out.println(food.getName()+"-->"+food.getPrice()));


        System.out.println("*************///****************");
//        list.stream().filter(l->l.getPrice()>0).sorted().forEach(s-> System.out.println(s.getName()+" - > "+s.getPrice()));

        list.stream().sorted(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getPrice() - o2.getPrice();
            }
        }).forEach(System.out::println);
        System.out.println("//////////////");
        list.stream().sorted(( o1, o2) -> (o2.getPrice() - o1.getPrice())).forEach(l-> System.out.println(l));


        System.out.println("////////////////comparing long ascending order////////////////");

        list.stream().sorted(Comparator.comparingLong(Food::getPrice)).forEach(l-> System.out.println(l));


        System.out.println("////////////////comparing long descending order////////////////");

        list.stream().sorted(Comparator.comparingLong(Food::getPrice).reversed()).forEach(l-> System.out.println(l));

    }

}
