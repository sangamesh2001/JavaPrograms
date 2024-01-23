package com.girmiti.javaprograms;

public class StringProblems {

	public static void main(String[] args) {
		
		//Converting char to int, also sum all numbers and converting lowerCase to upperCase
		String str = "GirMiti";
		String str1 = "";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(c+" "+ (int)c);
			sum+=c;
			if(c>=65 && c<=90) {
				int n = c+32;
				str1 = str1 +(char)n;
			}else if(c>=97 && c<=122) {
				int n = c-32;
				str1 =str1 + (char)n;
			}
		}
		System.out.println(sum);
		System.out.println("Original String : "+str);
		System.out.println("Converted to : "+str1);
       
		
	    for(int i=0;i<str.length();i++) {
	    	
	    }
	    
	  System.out.println(1+9+"s"+9+6);
	}

}
