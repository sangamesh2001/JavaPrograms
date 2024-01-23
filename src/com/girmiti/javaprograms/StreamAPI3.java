package com.girmiti.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Student{
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	public String toString() {
		return "Name is "+name +" ,age is"+age;
	}
}

public class StreamAPI3 {

	public static void main(String[] args) {
		
	
		
		List<Student> list = new ArrayList<>(Arrays.asList(
                new Student("Achal", 23),
                new Student("Vinayaka", 32),
                new Student("Akash", 40),
                new Student("John", 23),
                new Student("Akshata", 20)
        ));
		
		List<Student> filteredAndSorted = list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .collect(Collectors.toList());

        // Print the filtered and sorted students
        filteredAndSorted.forEach(System.out::println);
        
	}

}
