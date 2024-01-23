package com.girmiti.javaprograms;


class Instances{
	private static Instances i;
	
	private Instances() {
		
	}
	
	public static Instances getInstance() {
		if(i == null) {
			i = new Instances();
			return i;
		}else {
			return i;
		}
	}
	
	public void girmiti() {
		System.out.println("Payment domain");
	}
}

public class SingleTonDesignPattern {

	public static void main(String[] args) {
		Instances i1= Instances.getInstance();
		Instances i2 = Instances.getInstance();
		System.out.println(i1 == i2);
	}
}
