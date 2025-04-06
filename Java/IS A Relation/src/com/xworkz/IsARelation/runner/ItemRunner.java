package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Item;
import com.xworkz.IsARelation.internal.Shop;

public class ItemRunner {
    public static void main(String[] args) {

        Shop shop1 = new Shop();
        shop1.add();
        shop1.name();
        shop1.item();

        System.out.println("--------------");

        Item item = new Item();
        item.add();
        item.name();
        item.item();

        System.out.println("--------------");

        Shop shop = new Item();
        shop.add();
        shop.name();
        shop.item();
    }
}
