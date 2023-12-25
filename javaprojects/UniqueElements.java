package com.javaprojects;

import java.util.*;

public class UniqueElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		LinkedHashSet lhs=new LinkedHashSet();
		for(int i=1;i<=in;i++)
		{
			String str=sc.next();
			lhs.add(str);
		}
		ArrayList al=new ArrayList(lhs);
		System.out.println(al);
	}

}
