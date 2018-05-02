package com.iqmsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
