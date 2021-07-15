package com.bootcamp_santander.personapi.dto.repositories;

import com.bootcamp_santander.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
