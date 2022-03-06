package com.example.final_project.thymeleaf.controller;


import com.example.final_project.entity.Dog;
import com.example.final_project.thymeleaf.services.DogService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@Controller
@RequestMapping("/dogs")
@Slf4j
public class DogMvcController {

    private final DogService dogService;

    @GetMapping()
    public String listDogs(Model model){
        List<Dog> dogsList = dogService.getAllDogs();
        log.info("dogsList size:{}",dogsList.size());
        model.addAttribute("dogsList",dogsList);
        return "dogs-list";
    }

    @GetMapping("/form")
    public String dogsForm(Model model){
        Dog dog = new Dog();
        model.addAttribute("dog",dog);
        return "dogs-form";
    }
    @GetMapping("/formForUpdate")
    public String dogsFormForUpdate(@RequestParam("dogId") Long doId, Model model){
        Dog dog = dogService.getDogById(doId);
        model.addAttribute("dog",dog);
        return "dogs-form";
    }
    @PostMapping("/save")
    public String saveDog(@ModelAttribute("dog") Dog dog){
        dogService.saveDog(dog);
        return "redirect:/dogs";
    }
    @GetMapping("/delete")
    public String deleteDog(@RequestParam("dogId") Long id){
        dogService.deleteDog(id);
        return "redirect:/dogs";
    }

}
