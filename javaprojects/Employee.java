package com.javaprojects;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private static int generateid=1000;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name,double salary) {
		this.id=++generateid;
		this.name=name;
		this.salary=salary;
	}
}
