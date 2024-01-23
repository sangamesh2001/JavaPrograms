package com.girmiti.javaprograms;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

interface Function<T ,U, R>{
	public R appl(T x, U u) ;
	default void fun() {
		System.out.println("evening....");
	}
}

class Fun{
    BiConsumer<Integer, Integer> swim(int a, int d) {
		System.out.println(a+d);
		return null;
	}
}

public class Laptop {
	

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (x,y) -> x+y;
		int res= f.apply(10, 20);
              System.out.println(res);
              
              Fun f2 = new Fun();
              
       BiConsumer<Integer, Integer> bc = f2.swim(10, 20);
       
	}
}