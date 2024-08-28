package com.polymorphism;

public class Product {
	public void search(int pid) {
		System.out.println("search through id "+pid);
	}
	public void search(String pname) {
		System.out.println("serach through name "+pname);
	}
	public void search(String pname,int pid) {
		System.out.println("serach through "+pname +" and " +pid);
	}
	public static void main(String args[]) {
		Product p=new Product();
		p.search(999);
		p.search("man");
		p.search("mani",999);
	}
}
