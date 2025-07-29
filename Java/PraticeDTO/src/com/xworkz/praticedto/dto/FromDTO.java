package com.xworkz.praticedto.dto;

public class FromDTO {
    private String name;
    private String email;
    private int phNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public FromDTO(String name, String email, int phNo) {
        this.name = name;
        this.email = email;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "FromDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phNo=" + phNo +
                '}';
    }
}
