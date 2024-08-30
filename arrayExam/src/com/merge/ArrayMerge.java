package com.merge;
import java.util.Scanner;
public class ArrayMerge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size1=sc.nextInt();
	int size2=sc.nextInt();
	int[] a=new int[size1];
	int[] b=new int[size2];
	int[] c=new int[size1+size2];
	for(int i=0;i<size1;i++) {
		a[i]=sc.nextInt();
		System.out.print(a[i]+" ");
	}
	for(int j=0;j<size2;j++) {
		b[j]=sc.nextInt();
		System.out.print(b[j]+" ");
	}
	for(int i=0;i<size1;i++) {
		c[i]=a[i];
	}
	for(int j=0;j<size2;j++) {
		c[size1+j]=b[j];
	}
	System.out.println("the merge array is : ");
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");
		
	}
	
	
}
}
