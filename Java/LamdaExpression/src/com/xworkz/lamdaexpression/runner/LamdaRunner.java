package com.xworkz.lamdaexpression.runner;

import com.xworkz.lamdaexpression.lamda.Bottle;
import com.xworkz.lamdaexpression.lamda.Customer;

public class LamdaRunner {
    public static void main(String[] args) {
//        Bottle bottle = (int no)->{
////            System.out.println("running lamda impl :"+no);
////            if(no>0){
////                return true;
////            }
////            return false;
////        };

        Customer customer = new Customer();
        customer.buy((no)->no>0);
    }
}
