package com.girmiti.javaprograms;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String s1 = sc.nextLine();
		System.out.println("enter the start: ");
		int start = sc.nextInt();
		System.out.println("enter the end: ");
		int end = sc.nextInt();
		String s2 ="";
		for(int i=start;i<end;i++) {
			char c = s1.charAt(i);
			s2 = s2 + c;
		}
		System.out.println("substring of string: "+s2);

	}

}
