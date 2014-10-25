package com.kutco.schoolhub.DAO;

import com.kutco.schoolhub.models.*;
/*
 * class to communicate the the database
 */
public interface CourseGroupDAO {
	/*
	 * method to create CourseGroup
	 */
	public CourseGroup CreateRescource(String name);
	/*
	 * method to get CourseGroup
	 */
	public CourseGroup getCourceResourse();
	/*
	 * method to update CourseGroup
	 */
	public void UpdateCourseGroup(CourseGroup coursegroup);

}
