package com.girmiti.javaprograms;

import java.util.HashMap;
import java.util.HashSet;



public class Collections {
	
	public static boolean isTwice(int[] ar) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : ar) {
				map.put(i, map.getOrDefault(i,0)+1);
		}
		
		for(int j : map.values()) {
			if(j != 2) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean twise(int[] ar) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<ar.length;i++) {
			if(hs.contains(ar[i])) {
				return true;
			}else {
				hs.add(ar[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
       int[] ar = {2,3,4,5};
       
       System.out.println(twise(ar));
	}
}
