package com.example.final_project.repository;

import com.example.final_project.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DogRepository extends JpaRepository<Dog,Long> {
}
