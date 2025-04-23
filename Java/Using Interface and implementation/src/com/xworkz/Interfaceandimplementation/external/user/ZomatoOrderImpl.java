package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.OrderPolicy;

public class ZomatoOrderImpl {
    private OrderPolicy orderPolicy;

    public ZomatoOrderImpl(OrderPolicy orderPolicy) {
        this.orderPolicy = orderPolicy;
    }

    public void monitorOrder() {
        if (orderPolicy != null) {
            orderPolicy.trackOrder();
        } else {
            System.out.println("OrderPolicy is null");
        }
    }
}
