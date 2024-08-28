package com.abstarction;
interface DemoInterfa{
	final int age=90;
	public abstract void m1();
	       abstract void m2();
	                void m3();
}

public class Demo1 implements DemoInterfa{

	@Override
	public void m1() {
		System.out.println("im m1");
		
	}

	@Override
	public void m2() {

	System.out.println("im m2");
		
	}

	@Override
	public void m3() {
		System.out.println("im m3");
		
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.m1();
		d.m2();
		d.m3();
	}

}
