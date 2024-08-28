package com.inheritence;


class Parent{
	public void m2(){
	System.out.println("Im the parent");
	}
}
public class Child extends Parent {
	public void m1(){
	System.out.println("Im the child of the parent");
	}
	public static void main(String args[]) {
		Child ch= new Child();
		ch.m1();
	}
}
