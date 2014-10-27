package com.kutco.schoolhub.DAO.impl;

import com.kutco.schoolhub.models.*;
import com.kutco.schoolhub.DAO.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kutco.schoolhub.DAO.*;
import com.kutco.schoolhub.models.CourseResource;
import com.kutco.schoolhub.models.Student;

public class JdbcCourseResourceDAO implements CourseResourceDAO{
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public CourseResource CreateRescource(String name) { int id=0;
		
		String sql = " insert into courseresource ( NAME ) values ( ? ) ";
		
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
		
		return new CourseResource(id,name);
	}

	@Override
	public CourseResource getCourceResourseById(int id) {
		String sql = "SELECT * FROM COURSERESOURCE WHERE ID = ?";
		CourseResource cr = null;
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cr = new CourseResource(
						id,
						rs.getString("name")
						);
			}
			rs.close();
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
		return cr;
	}

	@Override
	public void UpdateCourseResource(CourseResource cr) {
		// TODO Auto-generated method stub
		
	}

}
