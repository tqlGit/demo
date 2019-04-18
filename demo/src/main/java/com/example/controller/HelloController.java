package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@Autowired
	private PersonService personService;
	

	@RequestMapping("/test8")
	public List<Person> test8(){
		return personService.findPersonList();
	}
	
	
	@RequestMapping("/test7/{id}")
	public Person test7(@PathVariable(name="id")Integer id){
		return personService.findPersonById(id);
	}
	
	
	@RequestMapping("/test6")
	public String test6(){
		return "test_send_post";
	}
	
	
	@RequestMapping("/test5")
	public void test5(@RequestBody Person user){
		System.out.println(user.toString());
		System.out.println(user.getPname());
	}
	
	
	/*
	 * get方式url传参  @RequestParam  ?name=xxx&age=xxxx
	 */
	@RequestMapping("/test4")
	public void test4(@RequestParam("name")String username,@RequestParam("age")Integer userage,
			@RequestParam(defaultValue="xxxxxxxxxxasd")String str){
		System.out.println("name="+username);
		System.out.println("age="+userage);
		System.out.println("str="+str);
	}
	
	
	/*
	 * get方式url传参   @PathVariable
	 */
	@RequestMapping("/test3/{name}/{age}")
	public void test3(@PathVariable(name="name")String name,@PathVariable(name="age")Integer age){
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	
	
	@RequestMapping("/test1")
	public String test1(){
		return "hello,xiaoming";
	}
	
	@RequestMapping("/test2")
	public Person test2(){
		Person user  = new Person(1,"xj","111");
		return user;
	}
	
}
