package com.girmiti.javaprograms;

import java.util.Arrays;
import java.util.List;

public class LamdExpressions {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0,2,4,6,3,56);
		list.forEach(System.out :: println);
        list.stream().map(n -> n*10 ).forEachOrdered(System.out :: println);
        
	}

}
