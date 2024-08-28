package com.area;
import java.util.Scanner;
public class Circlerad {
	public static void main(String args[]) {
	double radius,area;
	double pi=3.14159;
	Scanner s=new Scanner(System.in);
	radius=s.nextDouble();
	area=pi*radius*radius;
	System.out.println("Area"+area);
}
}
