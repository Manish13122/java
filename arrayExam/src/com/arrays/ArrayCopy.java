package com.arrays;
import java.util.Scanner;

public class ArrayCopy {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size = sc.nextInt();
	int[] a1=new int[size];
	int[] a2=new int[size];
	System.out.println("old array: ");
	for(int i=0;i<size;i++) {
		a1[i]=sc.nextInt();
		System.out.print(a1[i]+" ");
	}
	for(int i=0;i<size;i++) {
		a2[i]=a1[i];
	}
	System.out.println("new array: ");
	for(int i=0;i<size;i++) {
		System.out.print(a2[i]+" ");
	}
	
}
}
