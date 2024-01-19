package com.myProject.demo.services;

import com.myProject.demo.models.Labb1Model;
import com.myProject.demo.repository.Labb1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Labb1Services {
    @Autowired
    Labb1Repository labb1Repository;

    public Labb1Model createLabb1Model(Labb1Model labb1Model) {
        return labb1Repository.save(labb1Model);
    }
}
