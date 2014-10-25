package com.kutco.schoolhub.DAO;

import com.kutco.schoolhub.models.*;
/*
 * class to communicate the the database
 */
public interface CourseResourceDAO {
	/*
	 * method to create resources
	 * TODO
	 */
	public CourseResource CreateRescource(String name);
	/*
	 * method to get resources
	 * TODO
	 */
	public CourseResource getCourceResourse();
	/*
	 * method to update resource
	 * TODO
	 */
	public void UpdateCourseResource(CourseResource cr);

}
