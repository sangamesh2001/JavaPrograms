package com.girmiti.task;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfjoing;
	double salary;
	
	public Employee(int id, String name, int age, String gender, String department, int yearOfjoing, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfjoing = yearOfjoing;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setAge(short age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfjoing() {
		return yearOfjoing;
	}
	public void setYearOfjoing(byte yearOfjoing) {
		this.yearOfjoing = yearOfjoing;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfjoing=" + yearOfjoing + ", salary=" + salary + "]";
	}
}

public class StreamAPIRealTimeExample {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
                new Employee(1, "Achal", 23, "Male", "CSE", 2019, 12000),
                new Employee(2, "Ujith", 24, "Male", "ME", 2014, 13000),
                new Employee(3, "Sangamesh", 20, "Male", "ECE", 2023, 11000),
                new Employee(4, "Vinayak", 24, "Male", "ME", 2024, 18000),
                new Employee(5, "Vijay", 19, "Male", "ME", 2020, 10000),
                new Employee(6, "Akshat", 34, "Female", "ECE", 2021, 15000),
                new Employee(7, "Rani", 24, "Female", "IE", 2007, 13000),
                new Employee(8, "Pooja", 30, "Female", "IS", 2020, 131000)
        );
		//Grouping
		Map<String,Long> map = list
				.stream()
				.collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
        System.out.println(map);
        
        //counting employee based on department 
        Map<String,Long> map2 = list.stream()
        		.collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
        System.out.println(map2);
        
        //distinct
        Stream<String> distinct = list
        		.stream()
        		.map(Employee :: getDepartment)
        		.distinct();
        distinct.forEach(System.out :: println);
        
        //extracting the ages from a list of Employee objects:
        List<Integer> ages = list.stream().map(Employee :: getAge).collect(Collectors.toList());
        ages.forEach(System.out ::println);
        
        //average salary based on each department
        
       Map<String, Double> collect = list.stream()
    		   .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors
    				   .averagingDouble(Employee :: getSalary)));
       System.out.println(collect);
       
        
       //sorting employee based on age 
       
       Stream<Employee> sorted = list.stream().sorted((s1,s2) -> Integer.compare(s1.getAge(), s2.getAge()));
       sorted.forEach(System.out::println);
       System.out.println();
       Map<String, Double> emp = list.stream().sorted((s1,s2) -> Integer.compare(s1.getAge(), s2.getAge()))
    		   .collect(Collectors.groupingBy
    				   (Employee :: getDepartment, Collectors.averagingDouble
    						   (Employee :: getSalary)));
       System.out.println(emp);
       
       //Max salary list
       Optional <Employee> max = list.stream().max((a,b) -> Double.compare(a.getSalary(), b.getSalary()));
       System.out.println(max);
       
       //filter
       List<Employee> collect2 = list.stream().filter(salary -> salary.getSalary() > 15000).collect(Collectors.toList());
       collect2.forEach(n -> System.out.println(n));
       
       //increase the salary whose salary greater than 12k
       list.stream()
       .filter(employee -> employee.getSalary() > 12000)
       .map(employee -> {
           employee.setSalary(employee.getSalary() + 1000);
           return employee;
       })
       .forEach(System.out::println);

   // increase the salary of 10% whose age greater than 23 
   System.out.println("Original List:");
   list.forEach(System.out::println);
     List<Employee> emp1= list.stream().map( e -> {
	   if(e.getAge() > 23) {
		   e.setSalary(e.getSalary() * 1.10);
	   }
	return e;   
   })
   .collect(Collectors.toList());
     System.out.println("Updated list: ");
     emp1.forEach(System.out::println); 
     
     
	}
}
