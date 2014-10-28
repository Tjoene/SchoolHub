package com.kutco.schoolhub.models;

public class Course {
	private String name;
	private int id;
	private String toledoId;
	/*
	 * constructor without args
	 */
	public Course(){
		setName("unknown_name");
		setId(0);
		setToledoId("unknown_toledo_id");
	}
	/*
	 * constructor with args
	 */
	public Course(int id,String name,String toledoId){
		setName(name);
		setId(id);
		setToledoId(toledoId);
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
	 * getter toledo_id
	 */
	public String getToledoId() {
		return toledoId;
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
	 * getter toledo_id
	 */
	public void setToledoId(String toledoId) {
		this.toledoId = toledoId;
	}
	/*
	 * simple toString method
	 */
	public String toString(){
		return "Course id="+getId()+" name="+getName()+" toledoId="+getToledoId();
	}

}
