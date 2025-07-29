package com.xworkz.countries.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Staff {
    private int id;
    private String name;
    private String position;
    private Detail detail;
}
