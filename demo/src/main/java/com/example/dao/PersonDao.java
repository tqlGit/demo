package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Person;
import com.example.entity.PersonInfo;

@Mapper
public interface PersonDao {

	public Integer selectPersonList(); 
	
	public List<Person> selectPersonLists(); 
	
	public Integer insertPerson(@Param("person")Person person);
	
	public Person selectPersonById(@Param("id")Integer id); 
	
	
	public List<PersonInfo> selectPersonInfoList(); 
	
}
