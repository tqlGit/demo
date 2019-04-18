package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dao.MenuDao;
import com.example.entity.MenuInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuInfoTest {

	
	@Autowired
	private MenuDao menuDao;
	
	@Test
	public void Test1(){
		List<MenuInfo> selectMenuAll = menuDao.selectMenuAll();
		for (MenuInfo menuInfo : selectMenuAll) {
			System.out.println(menuInfo);
		}
	}
	
	
}
