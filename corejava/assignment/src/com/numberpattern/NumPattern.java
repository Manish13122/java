package com.numberpattern;
import java.util.Scanner;
public class NumPattern {
		public static void main(String args[]) {
			int n,num=1;
			Scanner s =new Scanner(System.in);
			n=s.nextInt();
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(num+" ");
					num++;
				}
				System.out.println();
				
			}
			
	}
}
