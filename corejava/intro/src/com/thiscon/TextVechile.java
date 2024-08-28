package com.thiscon;

class Vechile{
	String made;
	String model;
	int year;
	public Vechile(String made,String model,int year) {
		this.made=made;
		this.model=model;
		this.year=year;
	}
	public void displayInfo() {
		System.out.println("Im made of "+made);
		System.out.println("my modeel is "+model);
		System.out.println("my manufactured year is "+year);
	}
}
class Car extends Vechile{
	int tyres;
	public Car(String made,String model,int year,int tyres) {
		super(made,model,year);
		this.tyres=tyres;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("My tyres are"+tyres);
	}
}
class Truck extends Vechile{
	int loadcapactity;
	public Truck(String made,String model,int year,int loadcapacity) {
		super(made,model,year);
		this.loadcapactity=loadcapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("my loadCapacity is "+loadcapactity);
	}
}

public class TextVechile {
	public static void main(String args[]) {
	Car c= new Car("iron","Swift",2018,4);
	c.displayInfo();
	Truck t= new Truck("iron","Swift",2018,250);
	t.displayInfo();
}
}
