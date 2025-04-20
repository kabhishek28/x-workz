package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.CafeService;
import com.xworkz.InterfaceandImplentation.RulesClass.Train;

public class TrainCafe implements Train, CafeService {
    @Override public void boardPassengers() { System.out.println("TrainCafe boarding passengers."); }
    @Override public void runTrain() { System.out.println("TrainCafe running train service."); }
    @Override public void announceStop() { System.out.println("TrainCafe announcing next stop."); }
    @Override public void takeOrder() { System.out.println("TrainCafe taking customers' orders."); }
    @Override public void prepareOrder() { System.out.println("TrainCafe preparing food orders."); }
    @Override public void serveCustomer() { System.out.println("TrainCafe serving customers."); }
}