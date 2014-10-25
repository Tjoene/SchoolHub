package com.kutco.schoolhub.models;

public class CourseResource {
	private int id;
	private String name;
	/*
	 * constructor without args
	 */
	public CourseResource(){
		setName(name);
		setId(id);
	}
	/*
	 * constructor with args
	 */
	public CourseResource(int id,String name){
		setName(name);
		setId(id);
	}
	/*
	 * getter for the id
	 */
	public int getId(){return id;}
	/*
	 * setter for the id
	 */
	public void setId(int id){this.id = id;}
	/*
	 * getter for the name
	 */
	public String getName(){return name;}
	/*'
	 * setter for the name
	 */
	public void setName(String name){this.name = name;}

}
