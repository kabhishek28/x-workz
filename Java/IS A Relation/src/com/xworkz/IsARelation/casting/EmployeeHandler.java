package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Manager;
import com.xworkz.IsARelation.internal.Employee;

public class EmployeeHandler {

        public EmployeeHandler() {
            System.out.println("EmployeeHandler Constructor");
        }

        public void handleEmployee(Employee employee) {
            if (employee != null) {
                employee.work();
                employee.salary();
                employee.shift();
                employee.leave();
                employee.benefits();

                if (employee instanceof Manager) {
                    Manager manager = (Manager) employee;
                    manager.conductMeeting(); // Specific to Manager
                } else {
                    System.out.println("Given employee is not a Manager.");
                }
            }
        }


}
