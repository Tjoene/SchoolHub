package com.kutco.schoolhub.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kutco.schoolhub.DAO.*;
import com.kutco.schoolhub.models.CourseGroup;

public class JdbcCourseGroupDAO implements CourseGroupDAO{
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public CourseGroup CreateRescource(String name) { int id=0;
String sql = " insert into coursegroups ( NAME ) values ( ? ) ";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			ps.executeUpdate();
			ps.close();
			
			/* now get the generated id */
			sql = "select LAST_INSERT_ID() as lastId;";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				id = rs.getInt("lastId");
			}
			
			ps.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return null;
	}

	@Override
	public CourseGroup getCourceResourseById(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateCourseGroup(CourseGroup coursegroup) {
		// TODO Auto-generated method stub
		
	}

}
