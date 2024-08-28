package com.polymorphism;

class ParentFinal{//final classes can t extends
	int age=77;//final variable we cant change it
	public void getAge(int age) {//final method cant overrides
		this.age= ++age;
		System.out.println("my parent age is "+this.age);
	}
}
public class ThisFinal extends ParentFinal{
	public void getAge(int age) {
		this.age= --age;
		System.out.println("my age is "+this.age);
	}
	public static void main(String[] args) {
		ThisFinal tf=new ThisFinal();
		tf.getAge(22);
	}
}
