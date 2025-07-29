package com.xworkz.countries.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Education {
    private String degree;
    private String major;
    private University university;
}
