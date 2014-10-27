package com.kutco.schoolhub.models;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String nickname;
	private String password;
	private String role;
	/*
	 * constructor without args
	 */
	public Student(){
		setFirstName("FirstName_unknown");
		setLastName("LastName_unknown");
		setNickname("NickName_unknown");
		setId(0);
		setPassword("Password_unknown");
		setRole("Role_unknown");
	}
	/*
	 * constructor with args
	 */
	public Student(int id,String firstName,String lastName,String nickname, String password, String role){
		setFirstName(firstName);
		setLastName(lastName);
		setNickname(nickname);
		setId(id);
		setPassword(password);
		setRole(role);
	}
	/*
	 * getter for id
	 */
	public int getId(){
		return id;
	}
	/*
	 * getter for first name
	 */
	public String getFirstName(){
		return firstName;
	}
	/*
	 * getter for first name
	 */
	public String getLastName(){
		return lastName;
	}
	/*
	 * getter for first name
	 */
	public String getNickname(){
		return nickname;
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
	 * setter for first name
	 */
	public void setFirstName(String firstName){
		this.firstName =firstName;
	}
	/*
	 * setter for last name
	 */
	public void setLastName(String lastName){
		this.lastName =lastName;
	}
	/*
	 * setter for nickname
	 */
	public void setNickname(String nickname){
		this.nickname =nickname;
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
	
	/*
	 * a short toString method
	 */
	public String toString(){
		return "Student id= "+getId()+"Name:"+getFirstName()+" "+getLastName();
	}
}