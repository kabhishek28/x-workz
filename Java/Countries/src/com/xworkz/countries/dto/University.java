package com.xworkz.countries.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class University {
    private String name;
    private String location;
    private Chancellor chancellor;
}
