package com.uniqueArrays;
import java.util.Scanner;
public class UniqueArray {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++) {
        	a[i]=sc.nextInt();
        	} 
        for(int i=0;i<size;i++) {
        	int j;
        	for(j=0;j<i;j++) {
        		if(a[i]==a[j]) {
        			break;
        		}
        		
        	}
        	if(i==j) {
        		System.out.print(a[i]+" ");
        	}
}
}
}
