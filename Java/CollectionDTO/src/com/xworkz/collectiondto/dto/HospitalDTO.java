package com.xworkz.collectiondto.dto;

public class HospitalDTO {
    private String patientName;
    private int age;
    private String gender;
    private String department;
    private String doctorAssigned;
    private boolean isAdmitted;
    private double billAmount;

    public HospitalDTO( String patientName, int age,String gender, String department, String doctorAssigned, boolean isAdmitted, double billAmount) {
        this.gender = gender;
        this.patientName = patientName;
        this.age = age;
        this.department = department;
        this.doctorAssigned = doctorAssigned;
        this.isAdmitted = isAdmitted;
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" +
                "patientName='" + patientName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", doctorAssigned='" + doctorAssigned + '\'' +
                ", isAdmitted=" + isAdmitted +
                ", billAmount=" + billAmount +
                '}';
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
}
