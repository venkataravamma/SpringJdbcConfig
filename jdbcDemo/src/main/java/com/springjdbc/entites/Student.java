package com.springjdbc.entites;

public class Student {
	
	private int  Id;
	private String Name;
	private String City;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Student(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", City=" + City + "]";
	}
	

}
