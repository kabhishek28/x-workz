package com.xworkz.streamapi.runner;

import com.xworkz.streamapi.external.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UserRunner {
    public static void main(String[] args) {
        List<UserDTO> userDTOS = new ArrayList<>();
        userDTOS.add(new UserDTO(1, "K Abhi", "abhi@gmail.com"));
        userDTOS.add(new UserDTO(2, "S Priya", "priya123@example.com"));
        userDTOS.add(new UserDTO(3, "R John", "john.r@example.org"));
        userDTOS.add(new UserDTO(4, "N Meera", "meera.n@example.com"));
        userDTOS.add(new UserDTO(5, "D Alex", "alexd@example.net"));
        userDTOS.add(new UserDTO(6, "V Arjun", "arjunv@example.com"));
        userDTOS.add(new UserDTO(7, "T Sneha", "sneha.t@example.org"));
        userDTOS.add(new UserDTO(8, "M Rahul", "rahul.m@example.in"));
        userDTOS.add(new UserDTO(9, "L Divya", "divya_l@example.co"));
        userDTOS.add(new UserDTO(10, "B Rohit", "rohit_b@example.com"));

        userDTOS.stream().map(new Function<UserDTO, Object>() {
            @Override
            public Object apply(UserDTO userDTO) {
                return new UserDTO(userDTO.getId(),userDTO.getUserName(),userDTO.getEmail());
            }
        }).forEach(l-> System.out.println(l));
        System.out.println("******************* ");

        userDTOS.stream().map(userDTO -> new UserDTO(userDTO.getId(),userDTO.getUserName(),userDTO.getEmail())).forEach(l-> System.out.println(l));





    }
}
