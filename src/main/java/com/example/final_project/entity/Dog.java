package com.example.final_project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Dog {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String nickName;
    private Character sex;
    private Long trasnponderNumber;
    private LocalDate birthDate;
    private String handlerName;
    private String emailAdress;


    public Dog(Long id, String fullName, String nickName, Character sex, Long trasnponderNumber, LocalDate birthDate, String handlerName, String emailAdress) {
        this.id = id;
        this.fullName = fullName;
        this.nickName = nickName;
        this.sex = sex;
        this.trasnponderNumber = trasnponderNumber;
        this.birthDate = birthDate;
        this.handlerName = handlerName;
        this.emailAdress = emailAdress;
    }
}
