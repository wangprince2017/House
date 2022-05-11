package com.swjd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.swjd.bean.House;
import com.swjd.util.BaseDao;

public class HouseDaoImpl implements HouseDao{

	@Override
	public int add(House house) {
		Connection conn = BaseDao.getConn();
		PreparedStatement ps = null;
		int num = 0;
		String sql ="insert into house values(null,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, house.getLetName());
			ps.setString(2, house.getLetType());
			ps.setInt(3, house.getLetPrice());
			ps.setString(4, house.getLetPhone());
			ps.setString(5, house.getLetAddress());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(null, ps, conn);
		}
		return num;
	}

	@Override
	public int delete(int id) {
		Connection conn = BaseDao.getConn();
		PreparedStatement ps = null;
		int num = 0;
		String sql ="delete from house where let_id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(null, ps, conn);
		}
		return num;
	}

	@Override
	public int update(House house, int id) {
		Connection conn = BaseDao.getConn();
		PreparedStatement ps = null;
		int num = 0;
		String sql ="update house set let_name=?,let_type=?,let_price=?,let_phone=?,let_address=? where let_id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, house.getLetName());
			ps.setString(2, house.getLetType());
			ps.setInt(3, house.getLetPrice());
			ps.setString(4, house.getLetPhone());
			ps.setString(5, house.getLetAddress());
			ps.setInt(6,id);
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(null, ps, conn);
		}
		return num;
	}

	@Override
	public List<House> selectAll() {
		List<House> list = new ArrayList<>();
		Connection conn = BaseDao.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from house";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				House house = new House();
				house.setLetId(rs.getInt("let_id"));
				house.setLetName(rs.getString("let_name"));
				house.setLetType(rs.getString("let_type"));
				house.setLetPrice(rs.getInt("let_price"));
				house.setLetPhone(rs.getString("let_phone"));
				house.setLetAddress(rs.getString("let_address"));
				list.add(house);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(rs, ps, conn);
		}
		return list;
	}

	@Override
	public List<House> selectMoHuByName(String name,String huXing) {
		List<House> list = new ArrayList<House>();
		Connection conn = BaseDao.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from house where let_name like '%"+name+"%' and let_type like '%"+huXing+"%'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				House house = new House();
				house.setLetId(rs.getInt("let_id"));
				house.setLetName(rs.getString("let_name"));
				house.setLetType(rs.getString("let_type"));
				house.setLetPrice(rs.getInt("let_price"));
				house.setLetPhone(rs.getString("let_phone"));
				house.setLetAddress(rs.getString("let_address"));
				list.add(house);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(rs, ps, conn);
		}
		return list;
	}


	public static void main(String[] args) {
	HouseDaoImpl houseDaoImpl = new HouseDaoImpl();

		System.out.println(houseDaoImpl.selectAll());
	}
}

