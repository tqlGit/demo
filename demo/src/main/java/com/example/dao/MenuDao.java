package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.MenuInfo;

@Mapper
public interface MenuDao {

	public List<MenuInfo> selectMenuAll();
	
}
