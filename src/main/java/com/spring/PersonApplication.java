package com.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.model.Person;
import com.spring.repository.IPersonRepository;

@SpringBootApplication
public class PersonApplication implements CommandLineRunner{
	@Autowired
	IPersonRepository repository;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Person id 1->{}",repository.getById(1));
		logger.info("Inserting->{}",
				repository.insert(new Person(5,"Pallavi","Nayak","Jajpur")));

		logger.info("update 2 -> {}",
				repository.update(new Person(2,"Sniti","NAyak","Malkanagiri")));
		logger.info("All users -> {}",repository.getAll());
	

		
	}
}
