package com.girmiti.task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPItask2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,2,35,6,18);
		
		List<String> list2 = list.stream().map(Object :: toString).filter(n -> n.startsWith("1")).collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println("1's contains values :"+list.stream()
				.map(Object :: toString)
				.filter(n -> n.startsWith("1"))
				.count());
		
		
		int sum = list.stream().filter(n -> n%2 == 0).mapToInt(Integer :: intValue).sum();
		System.out.println("sum "+sum);
		
		Optional<Integer> max = list.stream().max(Integer :: compareTo);
		max.ifPresent(n -> System.out.println(n));
		
		 Optional<Integer> min = list.parallelStream().filter(n -> n%2 == 0).min(Integer :: compareTo);
		 min.ifPresent(System.out :: println);
		 
		 Optional<Integer> first = list.stream().filter(letter -> letter.equals(12)).findFirst();
		 first.ifPresent(n -> System.out.print("value :"+n));
	}

}
