package org.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String region;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String city;
}
