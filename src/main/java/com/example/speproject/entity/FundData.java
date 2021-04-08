package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Funddata")
public class FundData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "amount")
    private int amount;

    @Column(name = "dateid")
    private int dateId;


}
