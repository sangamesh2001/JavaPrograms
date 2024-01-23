package com.girmiti.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {

	public static void main(String[] args) {
		
		Comparator<Integer> cm = new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				if(a%10 > b%10) {
					return 1; // swap
				}
				return -1; //not - swap
			}
		};
		
		Comparator<Integer> cm1 = (a, b) ->{return (a%10 > b%10) ? 1 : -1;};
		
		
		List<Integer> li = new ArrayList<>();
        li.add(49);
        li.add(61);
        li.add(80);
        li.add(14);
        li.add(42);
        Collections.sort(li,cm1);
        System.out.println(li);
	}

}
