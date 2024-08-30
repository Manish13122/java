package com.positivenum;
import java.util.Scanner;
public class PositiveNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
		if(a[i]>0) {
			System.out.print(a[i]+" ");
		}
	}
}
}
