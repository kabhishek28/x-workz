package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Manager;
import com.xworkz.IsARelation.internal.Employee;

public class ManagerRunner {
    public static void main(String[] args) {
        Employee employee = new Manager();
        employee.work();
        employee.salary();
        employee.shift();
        employee.leave();
        employee.benefits();

        System.out.println("******************");

        Manager manager = new Manager();
        manager.work();
        manager.salary();
        manager.shift();
        manager.leave();
        manager.benefits();
    }
}
