package com.swjd.service;

import java.util.List;

import com.swjd.bean.House;
import com.swjd.dao.HouseDaoImpl;

public class HouseServiceImpl implements HouseService{
	HouseDaoImpl houseDaoImpl = new HouseDaoImpl();

	@Override
	public int add(House house) {
		int jg = houseDaoImpl.add(house);
		return jg;
	}

	@Override
	public int delete(int id) {
		int jg = houseDaoImpl.delete(id);
		return jg;
	}

	@Override
	public int update(House house, int id) {
		int jg = houseDaoImpl.update(house, id);
		return jg;
	}

	@Override
	public List<House> selectAll() {
		List<House> list = houseDaoImpl.selectAll();
		return list;
	}

	@Override
	public List<House> selectMoHuByName(String name,String huXing) {
		List<House> list = houseDaoImpl.selectMoHuByName(name,huXing);
		return list;
	}

}

