package com.girmiti.javaprograms;

import java.util.Scanner;

public class Sorting {
	
	static boolean bubbleSort(int[] ar,int check) {
		int high = ar.length-1,mid =0 , low = 0;
		
		for(int i=0;i<ar.length;i++) {
			mid = ( low + high )/2;
			if(ar[mid] == check) {
				return true;
			}else if(ar[i] > check) {
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the size of an array: ");
		   int size = sc.nextInt();
		   
		   int[] ar = new int[size];
		   
		   for(int i=0;i<ar.length;i++) {
			   ar[i] = sc.nextInt();
		   }
		   int check = sc.nextInt();
		   bubbleSort(ar, check);
	}

}
