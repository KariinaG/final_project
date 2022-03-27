package com.example.final_project;

import com.example.final_project.entity.Competition;
import com.example.final_project.entity.Dog;
import com.example.final_project.repository.CompetitionRepository;
import com.example.final_project.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalProjectApplication
  //      implements CommandLineRunner
{

//    @Autowired
//    private CompetitionRepository competitionRepository;
   // private DogRepository dogRepository;

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        Dog dog = new Dog("Empire Of Fire Swift Katniss", "Katniss", 'F', 852963741456L);
//        dogRepository.save(dog);
//
//    }

}
