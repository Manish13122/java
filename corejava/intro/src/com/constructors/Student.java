package com.constructors;

public class Student {
	int stid;
	String stname;
	
	public Student() {
		stid=100;
		stname="devasena";
	}
	public void display() {
		System.out.println(stid+"name"+stname);
	}
	public static void main(String[] args) {
		Student st= new Student();
		st.display();
	}
}
