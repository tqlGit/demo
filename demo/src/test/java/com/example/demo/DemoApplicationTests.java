package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dao.PersonDao;
import com.example.entity.Person;
import com.example.entity.PersonInfo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private PersonDao testPerson;
	
	
	@Test
	public void Test5() throws ParseException{
		System.out.println("测试开始？");
		List<PersonInfo> selectPersonInfoList = testPerson.selectPersonInfoList();
		System.out.println(selectPersonInfoList.size());
		for (PersonInfo personInfo : selectPersonInfoList) {
			System.out.println(personInfo);
		}
	}
	
	
	@Test
	public void Test4() throws ParseException{
		System.out.println("测试开始？");
		Person selectPersonById = testPerson.selectPersonById(new Integer(34));
		System.out.println(selectPersonById);
	}
	
	
	@Test
	public void Test3() throws ParseException{
		System.out.println("测试开始？");
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		Person person = new Person("李四","1111",sdf.parse("1993-08-05"));
		System.out.println(person);
		Integer insertPerson = testPerson.insertPerson(person);
		System.out.println(insertPerson);
	}
	
	
	@Test
	public void Test2(){
		System.out.println("测试开始？");
		List<Person> selectPersonLists = testPerson.selectPersonLists();
		System.out.println(selectPersonLists.size());
		for (Person person : selectPersonLists) {
			System.out.println(person);
		}
	}
	
	
	@Test
	public void Test1(){
		System.out.println("测试开始？");
		Integer selectPersonList = testPerson.selectPersonList();
		System.out.println(selectPersonList);
	}
	
	@Test
	public void contextLoads() {
	}

	
	
	
}
