package com.girmiti.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	 private int age;
	 private String name;
	
	public Students(int age , String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return "Student name : " + name +" and age is :"+ age;
	}
	
	int getAge() {
		return age;
	}
	
}

public class Comparable1 {

	public static void main(String[] args) {
		
		Comparator<Students> stds = ( o1, o2) -> {
				return (o1.getAge()%10 > o2.getAge()%10) ? 1 : -1;
			};
			
     List<Students> std = new ArrayList<>();
     std.add(new Students(23, "Sangamesh"));
     std.add(new Students(49, "Guru"));
     std.add(new Students(29, "Vikas"));
     std.add(new Students(56, "Iranna"));
     std.add(new Students(24, "Vilas"));
      Collections.sort(std, stds);
    //  System.out.println(std);
     for(Students s : std) {
    	 System.out.println(s);
     }
	}

}
