package com.thiscon;
class SuperDemo{
	int salary=35000;
	public void getSalary(int salary) {
		salary=60000;
		System.out.println("my parent salary is :"+salary);
	}
}
public class ThisDemo extends SuperDemo {
	int salary=30000;
	public void getSalary(int salary)
{
		salary=40000;
		System.out.println("my salary is"+salary);
		System.out.println("my global salary:"+this.salary);
		System.out.println("object is :"+this);
		super.getSalary(70000);
		System.out.println("my parent global salary is "+super.salary);
		
		}
	public static void main(String args[]) {
		ThisDemo td=new ThisDemo();
		td.getSalary(10000);
	}
}
