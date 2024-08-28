package com.thiscon;

class EComSystem{
	int id;
	String name;
	double price;
	public EComSystem(int id,String name,double price) {
		this.id=id;
		this.name= name;
		this.price=price;
	}
	public void displayInfo() {
		System.out.println("the productid is "+id);
		System.out.println("the productName is "+name);
		System.out.println("the product Price is "+price);
		
	}
}
 
class Electonics extends EComSystem{
	String warrenty;
	public Electonics(int id,String name,double price,String warrenty) {
		super(id,name,price);
		this.warrenty=warrenty;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("the warrenty peroid is"+warrenty);
	}
}
class Clothing extends EComSystem{
	String size;
	public Clothing(int id,String name,double price,String size) {
		super(id,name,price);
		this.size=size;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("my size is "+size);
	}
}


public class EcomSys {
public static void main(String[] args) {
	Electonics ec=new Electonics(1302,"watch",200.33,"3years");
	ec.displayInfo();
	Clothing c=new Clothing(132,"shirt",22.33,"1year");
	c.displayInfo();
}
}
