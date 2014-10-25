package com.kutco.schoolhub.models;

public class Course {
	private String name;
	private int id;
	/*
	 * contructor without args
	 */
	public Course(){
		setName(name);
		setId(id);
	}
	/*
	 * constructor with args
	 */
	public Course(int id,String name){
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

}
