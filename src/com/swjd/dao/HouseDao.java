package com.swjd.dao;

import java.util.List;

import com.swjd.bean.House;

public interface HouseDao {

	public int add(House house);
	
	public int delete(int id);
	
	public int update(House house,int id);

	public List<House> selectAll();
	
	public List<House> selectMoHuByName(String name,String huXing);

}

