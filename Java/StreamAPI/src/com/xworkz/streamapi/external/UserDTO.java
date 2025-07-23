package com.xworkz.streamapi.external;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString(onlyExplicitlyIncluded = true )
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @ToString.Include
    private int id;

    @ToString.Include(name = "Name")
    private String userName;

    private String email;



}
