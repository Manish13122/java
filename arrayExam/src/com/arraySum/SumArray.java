package com.arraySum;
import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		int sum=0;
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
		sum+=a[i];
		
	}
	System.out.println("the sum of elements in array is : "+sum);
	}
	
}
