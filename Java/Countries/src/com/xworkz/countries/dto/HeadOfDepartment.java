package com.xworkz.countries.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor


public class HeadOfDepartment {
    private String name;
    private int salary;
    private List<Staff> list;
}
