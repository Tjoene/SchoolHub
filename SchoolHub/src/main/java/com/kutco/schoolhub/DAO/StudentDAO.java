package com.kutco.schoolhub.DAO;

import com.kutco.schoolhub.models.*;
/*
 * class to communicate with the database
 */
public interface StudentDAO {
	/*
	 * method to create Student
	 */
	public Student CreateStudent(String firstName,String lastName,String nickname, String password, String role);
	/*
	 * method to get Student
	 */
	public Student getStudentById(int id);
	/*
	 * method to get a student by nickname
	 */
	public Student getStudentByNickname(String nickname);
	/*
	 * method to update Student
	 */
	public void UpdateStudent(Student student);
	/*
	 * method to remove a student
	 */
	public void RemoveStudent(Student student);

}
