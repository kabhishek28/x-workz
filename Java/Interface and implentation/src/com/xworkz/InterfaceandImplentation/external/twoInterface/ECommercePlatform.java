package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.OnlineStore;
import com.xworkz.InterfaceandImplentation.RulesClass.PointOfSale;

public class ECommercePlatform implements OnlineStore, PointOfSale {
    @Override public void addToCart() { System.out.println("ECommercePlatform item added to cart."); }
    @Override public void makePayment() { System.out.println("ECommercePlatform processing payment."); }
    @Override public void trackOrder() { System.out.println("ECommercePlatform tracking order."); }
    @Override
    public void processTransaction() {
        System.out.println("processTransaction method with two interface");
    }
    @Override
    public void printReceipt() {
        System.out.println("printReceipt method with two interface");
    }
    @Override
    public void updateInventory() {
        System.out.println("updateInventory method with two interface");
    }


}
