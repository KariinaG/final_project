package com.example.final_project.controller;

import com.example.final_project.entity.Dog;
import com.example.final_project.thymeleaf.services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Registration {

    @Autowired
    private DogServiceImpl dogServiceImpl;

    @GetMapping("/dogs")
    public List<Dog> getDogs() {
        return dogServiceImpl.getAllDogs();
    }

    @GetMapping("/dogs/{id}")
    public ResponseEntity<Dog> getDog(@PathVariable Long id) {
        Dog dog = dogServiceImpl.getDogById(id);

        return new ResponseEntity(dog, HttpStatus.OK);
    }

    @PostMapping("/dogs")
    public Dog getDogs(@RequestBody Dog dog){
        return dogServiceImpl.saveDog(dog);
    }

    @DeleteMapping("/dogs/{id}")
    public void getDogs(@PathVariable Long id){
        dogServiceImpl.deleteDog(id);
    }
}


