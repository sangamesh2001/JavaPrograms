package com.girmiti.javaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Lamda1 {

	public static void main(String[] args) {
//		int[] ar = new int[] {
//				2,3,5,9,10,56, 45, 90,39
//		};
//		
//		HashSet<Integer> hs = new HashSet<>();
//		for(int element : ar) {
//			hs.add(element);
//		}
//		Iterator<Integer> itr= hs.iterator();
//		while(itr.hasNext()) {
//			int n = itr.next();
//			if(n%2 !=0){
//				hs.add(n+2);
//			}
//		}
		//System.out.println(hs);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(33);
		al.add(40);
		
		//al.forEach(n -> System.out.println(n));
		
		al.forEach(n ->{
			if(n%2 == 0) {
				System.out.println(n);
			}
		});
	}
}
