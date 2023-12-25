package com.javaprojects;

public class EmployeeManager {
	private Employee[] e;
	private int size;
	private int capacity;
	public Object display;
	public EmployeeManager(int capacity) {
		this.capacity=capacity;
		e=new Employee[capacity];
		size=0;
	}
	//-----------------------------------
	public void addEmployee(String name,double salary) {
		e[size]=new Employee(name,salary);
		System.out.println("Employee Details Added and his Id is "+e[size].getId());
		size++;
	}
	//------------------------------------
	public void displayEmployee(int id) {
		for(int i=0;i<size;i++)
		{
			if(id==e[i].getId()) {
				System.out.println("Employee Details:");
				System.out.println("Employee ID "+e[i].getId());
				System.out.println("Employee Name "+e[i].getName());
				System.out.println("Employee Salary "+e[i].getSalary());
			}
		}
	}
	//------------------------------------
	public void allList() {
		for(int i=0;i<size;i++)
		{
			System.out.println("Employee Details:");
			System.out.println("Employee ID "+e[i].getId());
			System.out.println("Employee Name "+e[i].getName());
			System.out.println("Employee Salary "+e[i].getSalary());
			System.out.println("===================================================================");
		}
	}
}
