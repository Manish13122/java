package com.addition;
import java.util.Scanner;

public class Addition {
	public static void main(String args[]) {
	int x;
	int y;
	Scanner s = new Scanner(System.in);
	System.out.println("First Integer:");
	x=s.nextInt();
	System.out.println("Second Integer:");
	y=s.nextInt();
	int sum=x+y;
	System.out.println("Sum of two integers: " +sum);
	
	}
	
}
