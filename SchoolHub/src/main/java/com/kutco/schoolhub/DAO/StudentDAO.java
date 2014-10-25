package com.kutco.schoolhub.DAO;

import com.kutco.schoolhub.models.*;
/*
 * class to communicate the the Student
 */
public interface StudentDAO {
	/*
	 * method to create Student
	 */
	public CourseResource CreateStudent(String name);
	/*
	 * method to get Student
	 */
	public CourseResource getStudent();
	/*
	 * method to update Student
	 */
	public void UpdateStudent(CourseResource cr);

}
