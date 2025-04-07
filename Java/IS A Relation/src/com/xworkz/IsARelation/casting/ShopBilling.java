package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Item;
import com.xworkz.IsARelation.internal.Shop;

public class ShopBilling {


        public ShopBilling() {
            System.out.println("ShopBilling Constructor");
        }

        public void generateBill(Shop shop) {
            if (shop != null) {
                shop.name();
                shop.add();
                shop.item();

                if (shop instanceof Item) {
                    Item item = (Item) shop;
                    item.generateReceipt();
                } else {
                    System.out.println("Shop is not an instance of Item");
                }
            }
        }


}
