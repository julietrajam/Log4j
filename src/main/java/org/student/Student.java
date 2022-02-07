package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student name: Juliet");
	}
	
	
	public void studentDept()
	{
		System.out.println("Student Dept: MCA");
	}
	
	public void studentID()
	{
		System.out.println("Student Id: 235356");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		
		s1.deptName();
		
		s1.studentName();
		s1.studentID();
		s1.studentDept();
		
		
		
		

	}

}
