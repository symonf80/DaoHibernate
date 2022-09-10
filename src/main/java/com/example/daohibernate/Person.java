package com.example.daohibernate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person {
    @EmbeddedId
    private PrimaryKey primaryKey;

    @Column(insertable = false,updatable = false)
    private String name;

    @Column(insertable = false,updatable = false)
    private String surname;

    @Column(insertable = false,updatable = false)
    private int age;
    @Column
    private int phone_of_number;
    @Column
    private String city_of_living;
}
