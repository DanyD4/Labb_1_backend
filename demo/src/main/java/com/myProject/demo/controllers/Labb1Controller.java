package com.myProject.demo.controllers;

import com.myProject.demo.models.Labb1Model;
import com.myProject.demo.services.Labb1Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Labb1Controller {
    Labb1Services labb1Controller;
    @Autowired
    Labb1Services labb1Services;

    @PostMapping("/labb") //kopplad till urln i postman
    public Labb1Model createLabb1Model(@RequestBody Labb1Model labb1Model) {
        return labb1Services.createLabb1Model(labb1Model);
    }
}
