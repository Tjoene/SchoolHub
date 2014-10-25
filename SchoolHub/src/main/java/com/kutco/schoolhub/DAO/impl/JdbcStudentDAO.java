package com.kutco.schoolhub.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kutco.schoolhub.DAO.*;
import com.kutco.schoolhub.models.CourseResource;

public class JdbcStudentDAO implements StudentDAO {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public CourseResource CreateStudent(String name_first , String name_last , String password,
			String role) {
		String sql = " insert into students ( NAME_FIRST , NAME_LAST , PASSWORD , ROLE) values ( ? , ? , ? , ? ) ";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name_first);
			ps.setString(2, name_last);
			ps.setString(3, password);
			ps.setString(4, role);
			
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
	public CourseResource getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateStudent(CourseResource cr) {
		// TODO Auto-generated method stub
		
	}

}
