package com.kutco.schoolhub.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.kutco.schoolhub.DAO.*;
import com.kutco.schoolhub.models.CourseResource;
import com.kutco.schoolhub.models.Student;

public class JdbcStudentDAO implements StudentDAO {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public Student CreateStudent(String firstName,String lastName,String nickname, String password, String role){ int id =0;
		String sql = " insert into students ( FIRSTNAME , LASTNAME , NICKNAME , PASSWORD , ROLE ) values ( ? , ? , ? , ? , ? ) ";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, nickname);
			ps.setString(4, password);
			ps.setString(5, role);
			
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
		return new Student(id,firstName,lastName,nickname,password,role);
	}

	@Override
	public Student getStudentById(int id) {
		String sql = "SELECT * FROM STUDENTS WHERE ID = ?";
		Student student = null;
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student = new Student(
						id,
						rs.getString("firstName"),
						rs.getString("lastName"),
						rs.getString("nickname"),
						rs.getString("password"),
						rs.getString("role"));
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
		return student;
	}
	@Override
	public Student getStudentByNickname(String nickname) {
		String sql = "SELECT * FROM STUDENTS WHERE NICKNAME = ?";
		Student student = null;
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nickname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student = new Student(
						rs.getInt("id"),
						rs.getString("firstName"),
						rs.getString("lastName"),
						nickname,
						rs.getString("password"),
						rs.getString("role"));
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
		return student;
	}

	@Override
	public void UpdateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void RemoveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
