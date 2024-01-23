package com.girmiti.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPI_task1 {
    public static boolean isPalindrome(String str) {
    	if(str.length()<1) {
    		return false;
    	}
    	
    	for(int i=0;i<str.length()-1;i++) {
    		
    		if(str.charAt(i) != str.charAt(str.length()-1-i)) {
    			return false;
    		}
    	}
    	return true;
    	
    }
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the word: ");
       String pal = sc.nextLine();
       
       ArrayList<String> ar = new ArrayList<String>();
       ar.add(pal);
       
       List<Boolean> collect = ar.stream().map(StreamAPI_task1 :: isPalindrome).collect(Collectors.toList());
       System.out.println(pal +" is palindrome ? :"+collect.toString());
	}

}
