package com.example.final_project.thymeleaf.services;

import com.example.final_project.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> getAllDogs();
    Dog getDogById(Long id);
    Dog saveDog(Dog dog);
    void deleteDog(Long id);

}
