package com.polymorphism;
class Parents {
	public void property() {
		System.out.println("1000 cr prop");
	}
	public void marriage() {
		System.out.println("arrange marriage");
	}
}
public class Vinay extends Parents {
	//@overridding
	public void marriage() {
		System.out.println("nno no im already in love");
	}
    public static void main(String args[]) {
	    Vinay v=new Vinay();
	    v.property();
	    v.marriage();
}
}
