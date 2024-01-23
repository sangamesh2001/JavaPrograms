package com.girmiti.javaprograms;


public class FindingNumber {

	public static void main(String[] args) {
//		 String s = "Sangamesh";
//		 String s1 = "";
//		 String s2 = "";
//		 
//		 for(int i=s.length()-1;i>=0;i--) {
//			 char c = s.charAt(i);
//			 s1 = s1+c;
//		 }
//		 System.out.println(s1);
//		 int j=s.length()-1;
//		 while(j>=0) {
//			 char c = s.charAt(j);
//			 s2 = s2+c;
//			 j--;
//		 }
//		 System.out.println(s2);
		 
		 
		 StringBuilder sd = new StringBuilder();
		 
		 System.out.println("Intial capacity: ");
		 System.out.println(sd.capacity());
		 
		 System.out.println("Appending value");
		 sd.append("Girmiti");
		 
		 System.out.println("printing String: ");
		 System.out.println(sd.toString());
		 
		 System.out.println("reverse the String: ");
		 System.out.println(sd.reverse());
		 
		 System.out.println("Inserting : ");
		 sd.reverse();
		 sd.append(" ");
		 sd.insert(7," company");
		 System.out.println(sd.toString());
		 
		 System.out.println("Ascii value : ");
		 System.out.println(sd.codePointAt(0));
		 
		 System.out.println("Accessing character: ");		
		 System.out.println(sd.charAt(0));
		 System.out.println(sd.charAt(6));
		 
		 System.out.println("index of string");
		 System.out.println(sd.indexOf("G"));
		 System.out.println(sd.indexOf("c"));
		 
		 System.out.println("Length method: ");
		 System.out.println(sd.length());
		 
		 System.out.println("last index method: ");
		 sd.append(" Girmiti");
		 System.out.println(sd.lastIndexOf("Girmiti"));
		 
		 System.out.println("Replacing method : ");
		 sd.replace(16, 24, "nice");
		 System.out.println(sd.toString());
		 System.out.println(sd.capacity());
		 
		 System.out.println("trim method");
		 sd.trimToSize();
		 System.out.println(sd.capacity());
		 System.out.println(sd.toString());
	}

}
