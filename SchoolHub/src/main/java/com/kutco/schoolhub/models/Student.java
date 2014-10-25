package com.kutco.schoolhub.models;

public class Student {
	private int id;
	private String name;
	/*
	 * getter for id
	 */
	public int getId(){
		return id;
	}
	/*
	 * getter for name
	 */
	public String getName(){
		return name;
	}
	/*
	 * setter for id
	 */
	public void setId(int id){
		this.id = id;
	}
	/*
	 * setter for name
	 */
	public void setName(String name){
		this.name =name;
	}
}