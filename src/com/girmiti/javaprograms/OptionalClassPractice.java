package com.girmiti.javaprograms;

import java.util.function.UnaryOperator;
import java.util.function.Function;
public class OptionalClassPractice {

	public static void main(String[] args) {
		//unaryOprator
       UnaryOperator<String> st = (x)-> x.concat(" Nirooggi");
       String apply = st.apply("Sangu");
       System.out.println(apply);
       
       //Function Operator
       Function<String,Integer> a = x -> x.length(); 
       Integer apply2 = a.apply("Sangu");
       System.out.println(apply2);
       
       Function<Integer, Integer> fu = x ->x*2;;
       int apply3 = a.andThen(fu).apply(apply);
       System.out.println(apply3);
       
       //BiFunction
	}
}
