package com.xworkz.ToString.internal;

public class ShoppingCart {

        private String itemName;
        private int quantity;
        private double unitPrice;

        public ShoppingCart(String itemName, int quantity, double unitPrice) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        @Override
        public String toString() {
            return "Item: " + itemName + ", Quantity: " + quantity + ", Unit Price: ₹" + unitPrice;
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ShoppingCart) {
                ShoppingCart other = (ShoppingCart) object;
                if (this.itemName.equals(other.itemName) ) {
                    return true;
                }
            }
        }
        return false;
    }


}
