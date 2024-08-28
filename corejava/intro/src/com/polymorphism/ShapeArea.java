package com.polymorphism;

public class ShapeArea {
	public double area(double side) {
		return side*side;
	}
	public double area(double length,double width) {
		return length*width;
	}
	public double area(double radius , boolean isCircle) {
		return Math.PI*radius*radius;
	}
	public static void main(String args[]) {
		ShapeArea s=new ShapeArea();
		System.out.println("rectangle"+s.area(9,2));
		System.out.println("square"+s.area(2));
		System.out.println("circle"+s.area(9,true));
	}
}
