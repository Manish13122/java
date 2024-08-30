package com.averagevalue;
import java.util.Scanner;
public class AverageSum {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
		sum+=a[i];
	}
	float average= (float) sum/size;
	System.out.println("the average sum is "+average);
}
}
