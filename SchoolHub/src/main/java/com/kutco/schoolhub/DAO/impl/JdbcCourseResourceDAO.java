package com.kutco.schoolhub.DAO.impl;

import com.kutco.schoolhub.DAO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.kutco.schoolhub.DAO.*;
import com.kutco.schoolhub.models.CourseResource;

public class JdbcCourseResourceDAO implements CourseResourceDAO{
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public CourseResource CreateRescource(String name) {
		String sql = " insert into courseresource ( NAME ) values ( ? ) ";
		System.out.println(sql); /* test print */
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
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
	public CourseResource getCourceResourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateCourseResource(CourseResource cr) {
		// TODO Auto-generated method stub
		
	}

}
