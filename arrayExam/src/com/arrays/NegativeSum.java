package com.arrays;
import java.util.Scanner;

public class NegativeSum {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<0) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}
