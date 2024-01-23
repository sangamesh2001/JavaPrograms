package com.girmiti.javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI2 {

	public static void main(String[] args) {
      List<String> nm = Arrays.asList("sangu","Achal","Vinni","Bharat");
      List<Integer> nm1 = Arrays.asList(1,2,3,41,5,6);
      //length
        nm.stream().filter(s -> s.length() <= 5).forEach(System.out::println);
      
        //UpperCase
        nm.stream()
                 .map(String :: toUpperCase)
                 .forEach(System.out::println);
        
        //Reduce
        int sum = nm1.stream().reduce(0,Integer :: sum);
        System.out.println(sum);
        //collect
        
       List<String> li = nm.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
       li.forEach(System.out::println);
       
       //count
       int count = (int) nm.stream().count();
       System.out.println(count);
       
       //matchs 
      boolean b = nm1.stream().anyMatch(n -> n%2 ==0);
      System.out.println(b);
      
      Optional<Integer> min = nm1.stream().min(Integer::compare);
      min.ifPresent(min1 -> System.out.println("Minimum Value: " + min1));
      
      Optional<Integer> max = nm1.stream().max(Integer :: compare);
      max.ifPresent(max1 -> System.out.println(max1));
      
	}

}
