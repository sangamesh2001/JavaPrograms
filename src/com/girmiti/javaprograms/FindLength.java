package com.girmiti.javaprograms;

public class FindLength {
	
	static boolean compare(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	static void concating(String s1, String s2) {
		for(int i=0;i<s2.length();i++) {
			s1 = s1 + s2.charAt(i);
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		String s = "Sangamesh";
		String s1 ="";
		int count=0;
		for(char c : s.toCharArray()) {
			count++;
		}
		System.out.println(count);
       
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			s1 =  s1+c;
		}
		System.out.println(s1);
		System.out.println( compare("Tarun", "Tarun"));
		concating("Tarun", "Tarun");
	}	

}
