package com.myProject.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "recipes")
public class Labb1Model {
    @Id
    private String id;
    private String title;
    private ArrayList<String> ingredients;
    private ArrayList<String> instructions;
    private String time;

    public Labb1Model() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public String getTime() {
        return time;
    }
}
