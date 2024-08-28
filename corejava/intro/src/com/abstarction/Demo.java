package com.abstarction;

abstract class TestAbstract{
	public static void m1(){
		System.out.println("im m1 method");
	}
	protected abstract void sleep();
}

public class Demo extends TestAbstract{
	@Override
	public void sleep() {
		System.out.println("im sleeping");
	}
	public static void main(String[] args) {
		//TestAbstract t=new TestAbstract();-->we unable to create abstract class object
		Demo d=new Demo();
		m1();
		d.sleep();
	}
	
}
