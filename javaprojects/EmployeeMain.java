package com.javaprojects;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeManager em=new EmployeeManager(10);
		boolean b=true;
		while(b) {
			System.out.println("Enter your choice");
			int input=sc.nextInt();
			if(input==1)
			{
				System.out.println("Enter Employee name");
				String name=sc.next();
				System.out.println("Enter Employee Salary");
				double sal=sc.nextDouble();
				em.addEmployee(name,sal);
			}
			else if(input==2)
			{
				System.out.println("Enter Employee ID:");
				int id=sc.nextInt();
				em.displayEmployee(id);
			}
			else if(input==3)
			{
				em.allList();
			}
		}
	}

}
//Employee.java
//EmployeeManager.java
