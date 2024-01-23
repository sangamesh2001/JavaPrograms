package com.girmiti.javaprograms;

import java.util.Scanner;

public class FirstProgram {
	//displaying array elements
	static void displayArray(int[] ar) {
		System.out.println("array values are: ");
		   for(int i : ar) {
			   System.out.print(i+" ");
		   }
	}
   
	//finding user element in array
	static boolean findNum(int[] ar, int userNumber) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i] ==  userNumber) {
				return true;
			}
		}
		return false;
	}
	
	//finding positive, Negative,Even, Odd and Zeros
	static void isContains(int[] ar){
		int even = 0;
		int odd =0;
		int negative = 0;
		int positive = 0;
		int zeros = 0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2 == 0) {
				even++;
			}
			if(ar[i]%2 != 0) {
				odd++;
			}
            if(ar[i]> 0) {
				positive++;
			}
            if(ar[i] < 0) {
				negative++;
			}
            if(ar[i] == 0) {
            	zeros++;
			}
		}
		System.out.println("even numbers are:"+even);
		System.out.println("odd numbers are: "+odd);
		System.out.println("positive numbers are: "+positive);
		System.out.println("Negative numbers are: "+negative);
		System.out.println("0's numbers are: "+zeros);
	}
	
	//Copying array in new array
	static void copyArray(int[] ar) {
		int[] newArray = new int[ar.length];
		
		for(int i =ar.length-1;i>=0;i--) {
			newArray[i] = ar[i];
		}
		System.out.println("new Array: ");
		for(int i : newArray) {
			System.out.print(i+" ");
		}
	 }
	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the size of an array: ");
	   int size = sc.nextInt();
	   
	   int[] ar = new int[size];
	   
	   for(int i=0;i<ar.length;i++) {
		   ar[i] = sc.nextInt();
	   }
	   displayArray(ar);
	   
//	   <---------------------------------------------------->
	   System.out.println();
	   System.out.println("Enter the element you want to search:");
	   int element =  sc.nextInt();
	   if(findNum(ar, element)) {
		   System.out.println(element+" is present in the array");
	   }else {
		   System.out.println(element+" is not present in the array");
	   }
//	   <---------------------------------------------------->
	   System.out.println();
	   isContains(ar);
	   copyArray(ar);
	}

}
