package com.charPattern;
import java.util.Scanner;
public class CharPat {
	public static void main(String args[]) {
		int n;
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		char c='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			
		}
		
	}
}
