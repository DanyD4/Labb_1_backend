package com.myProject.demo.repository;

import com.myProject.demo.models.Labb1Model;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Labb1Repository extends MongoRepository<Labb1Model, String> {
}
