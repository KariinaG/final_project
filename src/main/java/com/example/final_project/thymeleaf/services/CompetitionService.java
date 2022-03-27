package com.example.final_project.thymeleaf.services;

import com.example.final_project.entity.Competition;
import com.example.final_project.entity.Dog;

import java.util.List;

public interface CompetitionService {

    List<Competition> getAllCompetition();
    Competition getCompetitionById(Long id);
    Competition saveCompetition(Competition competition);
    void deleteCompetition(Long id);
}
