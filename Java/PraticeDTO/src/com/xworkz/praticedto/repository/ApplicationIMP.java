package com.xworkz.praticedto.repository;

import com.xworkz.praticedto.dto.FromDTO;
import com.xworkz.praticedto.service.Application;

public class ApplicationIMP implements Application {
    @Override
    public FromDTO getFrom(FromDTO fromDTO) {

        return fromDTO;
    }
}
