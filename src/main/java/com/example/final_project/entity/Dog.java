package com.example.final_project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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



    public Dog(String fullName, String nickName, Character sex, Long trasnponderNumber) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.sex = sex;
        this.trasnponderNumber = trasnponderNumber;


    }
}
