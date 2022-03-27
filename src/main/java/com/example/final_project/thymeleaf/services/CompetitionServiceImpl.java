package com.example.final_project.thymeleaf.services;

import com.example.final_project.entity.Competition;
import com.example.final_project.repository.CompetitionRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class CompetitionServiceImpl implements CompetitionService {

    private final CompetitionRepository competitionRepository;


    @Override
    public List<Competition> getAllCompetition() {
        return competitionRepository.findAll();
    }

    @Override
    public Competition getCompetitionById(Long id) {
        return null;
    }

    @Override
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    @Override
    public void deleteCompetition(Long id) {
        competitionRepository.deleteById(id);
    }
}
