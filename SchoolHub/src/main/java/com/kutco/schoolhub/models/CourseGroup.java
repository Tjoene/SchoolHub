package com.kutco.schoolhub.models;

public class CourseGroup {
	private String name;
	private int id;
	/*
	 * constructor without args
	 */
	public CourseGroup(){
		setName(name);
		setId(id);
	}
	/*
	 * constructor with args
	 */
	public CourseGroup(int id,String name){
		setName(name);
		setId(id);
	}
	/*
	 * getter name
	 */
	public String getName() {
		return name;
	}
	/*
	 * getter id
	 */
	public int getId() {
		return id;
	}
	/*
	 * setter name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * setter id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * simple toString method
	 */
	public String toString(){
		return "CourseGroup id="+getId()+" name="+getName();
	}
}
