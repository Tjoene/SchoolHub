package com.kutco.schoolhub.DAO;

import com.kutco.schoolhub.models.*;
/*
 * class to communicate the the database
 */
public interface CourseResourceDAO {
	/*
	 * method to create resources
	 */
	public CourseResource CreateRescource(String name);
	/*
	 * method to get resources
	 */
	public CourseResource getCourceResourse();
	/*
	 * method to update resource
	 */
	public void UpdateCourseResource(CourseResource cr);

}
