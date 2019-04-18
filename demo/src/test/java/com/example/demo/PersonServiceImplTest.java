package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Person;
import com.example.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceImplTest {

	@Autowired
	private PersonService personService;
	
	@Test
	public void TestPersonService(){
		Person findPersonById = personService.findPersonById(new Integer(34));
		System.out.println(findPersonById);
	}
	
	
}
