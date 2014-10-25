package com.kutco.schoolhub.DAO;

import com.kutco.schoolhub.models.*;
/*
 * class to communicate the the database
 */
public interface Course {
	/*
	 * method to create CourseGroup
	 */
	public Course CreateCourse(String name,String toledo_id);
	/*
	 * method to get CourseGroup
	 */
	public Course getCourse();
	/*
	 * method to update CourseGroup
	 */
	public void UpdateCourse(Course course);

}
