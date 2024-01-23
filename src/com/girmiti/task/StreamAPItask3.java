package com.girmiti.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamAPItask3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth salary: ");
		int n=sc.nextInt();
		List<Employee> list1 = Arrays.asList(
				new Employee(1, "John Doe", 28, "Male", "IT", 2015, 75000),
                new Employee(2, "Jane Smith", 35, "Female", "HR", 2012, 90000),
                new Employee(3, "Bob Johnson", 40, "Male", "Finance", 2010, 120000),
                new Employee(4, "Alice Williams", 32, "Female", "Marketing", 2014, 80000),
                new Employee(5, "Michael Brown", 45, "Male", "Operations", 2008, 110000),
                new Employee(6, "Emily Davis", 30, "Female", "IT", 2016, 85000),
                new Employee(7, "David Clark", 38, "Male", "Finance", 2011, 100000),
                new Employee(8, "Sophia Taylor", 28, "Female", "Marketing", 2013, 78000));
		Double max = list1.stream().map(Employee :: getSalary).distinct().sorted((s1,s2) -> Double.compare(s2, s1)).skip(n-1).findFirst()
				 .orElseThrow(() -> new IllegalArgumentException("Invalid number"));
		System.out.println(max);
		sc.close();
		
		long count = list1.stream().count();
		System.out.println(count);
		
		Stream<Employee> sorted = list1.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed());
		Object[] array = sorted.toArray();
		System.out.println(array[n-1]);
		
		list1.stream().filter()
	}
       
}
