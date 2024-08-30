package com.arrays;
import java.util.Scanner;
public class ElementSearch {
	public static void main(String[] args) {
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the search Element: ");
		int ele=sc.nextInt();
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
			if(ele==array[i]) {
				c++;
			}
		}
		if(c>0) {
		System.out.println("the element is there ");
		}else {
			System.out.println("the element is not there");
		}
		
	}
}
