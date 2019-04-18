package com.example.service;

import java.util.List;

import com.example.entity.Person;

public interface PersonService {

	public Person findPersonById(Integer id);
	
	
	public List<Person> findPersonList();
}
