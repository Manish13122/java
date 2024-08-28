package com.thiscon;
class SuperCon{
	int a=10;
	public SuperCon() {
		this(67);
		System.out.println("iam default parent construcctor "+a);
	}
	public SuperCon(int age) {
		System.out.println("Iam param parent Constructur"+age);
	}
}

public class ThisCons extends SuperCon{
	int a=20;
	public ThisCons() {
		this(12);
		System.out.println("iam a default constructor");
	}
	public ThisCons(int age) {
		this.m1();
		System.out.println("iam param constructor"+age);
	}
	public void m1() {
		System.out.println("Im Method From Child"+a);
	}
	public static void main(String args[]) {
		ThisCons th=new ThisCons();
		th.SuperCon(22);
	}
	

}
