package com.iqmsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.domain.Person;
import com.iqmsoft.repository.PersonRepository;

@Service
public class PersonRepositoryImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> loadAll() {
		return personRepository.findAll();
	}
	
	
}
