package com.palindrome;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		int n,sum=0;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("not palindrome");
		}
		
	}
}
