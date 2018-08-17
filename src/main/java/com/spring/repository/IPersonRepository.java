package com.spring.repository;

import java.util.List;

import com.spring.model.Person;

public interface IPersonRepository {
	public List<Person> getAll();
	public  int update(Person pr);
	public int insert(Person pr);
	public Person getById(int id);
	

}
