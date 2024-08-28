package com.methods;

public class Addition {
	public void add(int a,int b){
		System.out.println("the addition of two numbers"+(a+b));
	}
public static int sub(int a, int b) {
	return (a-b);
}
public int mul(int a,int b) {
	return (a*b);
}
public void div(int a,int b) {
	System.out.println(a/b);
}
	public static void main(String args[]) {
		Addition d=new Addition();
		d.add(5, 10);
		System.out.println(d.mul(3, 9));
		d.div(4, 2);
		System.out.println(Addition.sub(5, 2));
	}
}
