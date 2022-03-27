package com.example.final_project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Slf4j
@Entity
@Data
@NoArgsConstructor
public class Competition {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;
    private String competition;
    private String organiser;

    public Competition(Long id, String date, String competition, String organiser) {
        log.info("competition {}", date);
        this.id = id;
        this.date = date;
        this.competition = competition;
        this.organiser = organiser;
    }
}
