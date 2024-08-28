package com.polymorphism;

public class Calculator{
	public void addition(int a,int b,int c)
	{
		System.out.println("addition of three int types"+(a+b+c));
	}
	public void addition(int a,int b) {
		System.out.println("addition of two integers"+(a+b));
	}
	public void addition(float a,float b) {
		System.out.println("addtion of two float values"+(a+b));
	}
	public void addition(float a,int b) {
		System.out.println("addition of two integers"+(a+b));
	}
	public void addition(int a,float b) {
		System.out.println("addition of one int one float "+(a+b));
	}
	public static void main(String args[]) {
		Calculator c=new Calculator();
		c.addition(1,20);
		c.addition(2.0f, 30);
		c.addition(20.0f, 30.0f);
		c.addition(1, 02, 03);
		c.addition(20, 20.9f);
	}


}
