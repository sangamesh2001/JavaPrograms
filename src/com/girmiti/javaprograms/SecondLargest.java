package com.girmiti.javaprograms;

import java.util.Scanner;

public class SecondLargest {
	static void secondLarge(int[] ar) {
		int max1 = 0;
		int max2 = 0;
		if(ar[0] > ar[1]) {
			max1 = ar[0];
			max2 = ar[1];
		}else {
			max1 = ar[1];
			max2 = ar[0];
		}
		
		for(int i=2;i<ar.length;i++) {
			if(ar[i] > max1) {
				max2 = max1;
				max1 = ar[i];
			}else if(ar[i] > max2 && ar[i]!=max1) {
				max2 = ar[i];
			}
		}
		System.out.println("second large number "+max2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ar = new int[size];
        
        for(int i=0;i<ar.length;i++) {
        	ar[i] = sc.nextInt();
        }
        secondLarge(ar);
	}

}
