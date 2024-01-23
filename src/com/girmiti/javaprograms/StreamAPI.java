package com.girmiti.javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	
	public  boolean isPrime(int n) {
		if (n <= 1) return false;
 
		for(int i=2;i*i<=n;i++) 
			if(n%i == 0)return false;	
		return true;
}

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1,2,3,6,8,9,4);
		//even
		System.out.println("even");
		li.stream().filter(even -> even%2 == 0).forEach(System.out::println);
		
		//odd
		System.out.println("odd");
		li.stream().filter(odd -> odd%2 !=0).forEach(System.out::println);
		
		//prime
		System.out.println("Prime");
		li.stream().filter(new StreamAPI() :: isPrime).forEach(System.out::println);
	
	}

}
