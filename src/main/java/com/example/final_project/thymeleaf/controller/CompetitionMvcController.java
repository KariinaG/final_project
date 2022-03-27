package com.example.final_project.thymeleaf.controller;

import com.example.final_project.entity.Competition;
import com.example.final_project.entity.Dog;
import com.example.final_project.thymeleaf.services.CompetitionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@Controller
@RequestMapping("/competitions")
@Slf4j
public class CompetitionMvcController {

    private final CompetitionService competitionService;

    @GetMapping()
    public String listCompetitions(Model model){
        List<Competition> competitionsList = competitionService.getAllCompetition();
        log.info("competitionsList size:{}",competitionsList.size());
        model.addAttribute("competitionsList",competitionsList);
        return "competitions-list";
    }

    @GetMapping("/form")
    public String competitionsForm(Model model){
        Competition competition = new Competition();
        model.addAttribute("competition",competition);
        return "competitions-form";
    }
    @GetMapping("/formForUpdate")
    public String competitionsFormForUpdate(@RequestParam("competitionId") Long coId, Model model){
        Competition competition = competitionService.getCompetitionById(coId);
        model.addAttribute("competition",competition);
        return "competitions-form";
    }

    @PostMapping("/save")
    public String saveCompetition(@ModelAttribute("competition") Competition competition){
        log.info("competition {}",competition);
        competitionService.saveCompetition(competition);
        return "redirect:/competitions";
    }
//    @GetMapping("/delete")
//    public String deleteDog(@RequestParam("dogId") Long id){
//        dogService.deleteDog(id);
//        return "redirect:/dogs";
//    }
}
