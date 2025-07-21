package com.xworkz.comaparatorandcomparable.external;

import com.xworkz.comaparatorandcomparable.dto.BankDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankRunner {


    public static void main(String[] args) {

        BankDTO bankDTO = new BankDTO("Abhi",8520);
        BankDTO bankDTO1 = new BankDTO("ravi",7410);
        BankDTO bankDTO2 = new BankDTO("manju",9630);
        BankDTO bankDTO3 = new BankDTO("Mahesh",6541);
        BankDTO bankDTO4 = new BankDTO("nagaraj",1258);
        BankDTO bankDTO5 = new BankDTO("arjun",3624);


        List<BankDTO> list = new ArrayList<>();
        list.add(bankDTO);
        list.add(bankDTO1);
        list.add(bankDTO2);
        list.add(bankDTO3);
        list.add(bankDTO4);
        list.add(bankDTO5);


        Collections.sort(list);


        System.out.println(list);



    }
}
