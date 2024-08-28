package com.fibonacci;
import java.util.Scanner;
public class FIbbonacciSeries {
	public static void main(String args[]) {
		int a1=0,a2=1;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print(a1+" "+a2);
		for(int i=0;i<n;i++) {
			int a3=a1+a2;
			System.out.print(" "+a3);
			a1=a2;
			a2=a3;
		}
	}
}
