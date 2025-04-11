package com.xworkz.ToString.internal;


    public class LabTest {
        private String testName;
        private String patientName;
        private double cost;

        public LabTest(String testName, String patientName, double cost) {
            this.testName = testName;
            this.patientName = patientName;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Test: " + testName + ", Patient: " + patientName + ", Cost: ₹" + cost;
        }

        @Override
        public int hashCode(){
            return 4;
        }
}
