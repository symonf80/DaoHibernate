package com.example.daohibernate;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PrimaryKey> {
    List<Person> findByCity(String city);

  
    Optional<Person> findByNameAndSurname(String name, String surname);
}