package com.kutco.schoolhub.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kutco.schoolhub.DAO.*;

public class JdbcCourseDAO implements CourseDAO {
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public CourseDAO CreateCourse(String name, String toledo_id) {
		String sql = " insert into courses ( NAME , TOLEDO_ID ) values ( ? , ? ) ";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, toledo_id);
			
			ps.executeUpdate();
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
	public CourseDAO getCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateCourse(CourseDAO course) {
		// TODO Auto-generated method stub
		
	}

}
