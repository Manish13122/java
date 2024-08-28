package com.primenumbers;

public class PrimeNum {
	public static void main(String args[]) {
		int n=100;
		for(int i=2;i<=n;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c=1;
					break;
			}
		}
			if(c==0) {
				System.out.print(i+" ");
			}
	}
	}
}
