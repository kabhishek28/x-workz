package com.xworkz.praticedto.repository;

import com.xworkz.praticedto.dto.FromDTO;
import com.xworkz.praticedto.service.ApplicationCollection;

import java.util.ArrayList;
import java.util.List;

public class ApplicationCollectionIMP implements ApplicationCollection {
    @Override
    public List<FromDTO> getFrom(List<FromDTO> list) {
        System.out.println("returing ");
        return list;
    }
}
