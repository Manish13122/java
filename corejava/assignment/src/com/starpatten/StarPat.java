package com.starpatten;
import java.util.Scanner;
public class StarPat {
	public static void main(String args[]) {
		int n;
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
