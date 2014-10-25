package com.kutco.schoolhub.models;

public class Student {
	private int id;
	private String name;
	private String password;
	private String role;
	/*
	 * constructor without args
	 */
	public Student(){
		setName(name);
		setId(id);
	}
	/*
	 * constructor with args
	 */
	public Student(int id,String name){
		setName(name);
		setId(id);
	}
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
	 * getter for password
	 */
	
	public String getPassword() {
		return password;
	}
	/*
	 * getter for role
	 */
	public String getRole() {
		return role;
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
	
	/*
	 * setter for password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	 * setter for role
	 */
	public void setRole(String role) {
		this.role = role;
	}
}