package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "farePerKM")
    private Double farePerKm;

    @Column(name = "serviceid")
    private int serviceId;

}
