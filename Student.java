package com.day4;


public class Student{
	int roll;
	String name;
	int marks;
	
	void DisplayStudentDetails() {
		System.out.println("roll no is"+ roll);
		System.out.println("name is"+name);
		System.out.println("marks is"+marks);
	}
	public static void main(String[] args) {
		Student j=new Student();
		Student  k=new Student();
		j.roll=10;
		j.name="shameem";
		j.marks=60;
		k.roll=11;
		k.name="micheal";
		k.marks=80;
		
		
		j.DisplayStudentDetails();
		k.DisplayStudentDetails();
	}
}