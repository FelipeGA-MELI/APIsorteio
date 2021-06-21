package com.example.SpringHibernate.demo.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {
    public enum Gender {
        MALE,
        FEMALE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
}
