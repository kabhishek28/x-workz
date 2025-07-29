package com.xworkz.praticedto.runner;

import com.xworkz.praticedto.dto.FromDTO;
import com.xworkz.praticedto.repository.ApplicationCollectionIMP;
import com.xworkz.praticedto.repository.ApplicationIMP;
import com.xworkz.praticedto.service.Application;
import com.xworkz.praticedto.service.ApplicationCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        FromDTO fromDTO = new FromDTO("Abhi" , "abhi@gmail.com",234456780);
        Application application = new ApplicationIMP();
        FromDTO fromDTO1 = application.getFrom(fromDTO);
        System.out.println("mainnnnnnnnnnnnnnnnnnnnnnn--------------");
        System.out.println(fromDTO1.getName());


        System.out.println("***********************************************");
        FromDTO fromDTO2 = new FromDTO("vinith" , "vinith@gamil.com" , 1234567890);
        FromDTO fromDTO3 = new FromDTO("Ravi" , "ravi@gmail.com" , 123456789);
        List<FromDTO> list = new ArrayList<>();
        list.add(fromDTO2);
        list.add(fromDTO3);
        ApplicationCollection applicationCollection = new ApplicationCollectionIMP();

//        ArrayList<FromDTO> list1 = new ArrayList<>();


        list = applicationCollection.getFrom(list);
        System.out.println("after return");
        for(FromDTO fromDTO4 : list){
            System.out.println(fromDTO4);
        }

    }


}
