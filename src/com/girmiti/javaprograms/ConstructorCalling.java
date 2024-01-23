package com.girmiti.javaprograms;

class Company{

	int a = 120;
	int d = 35;
	
	public Company() {
		super();
		a = 40;
		d = 56;
		System.out.println(a);
		System.out.println(d);
	}
	
	 Company(int a, int z){
		this.a = a;
		d = z;
		System.out.println(a);
	}
}

class Girmiti extends Company{
	static int a;
	
	static {
		a = 20;
		System.out.println(a);
	}
	
	int b =0;
	int c = 40;
	{
		b = 90;
		c = 100;
	}
	
	Girmiti(){
		this(2,3);
		a = 30;
		System.out.println("Constructor of GIRMITI");
		c = 200;
		greeting();
	}
	
	Girmiti(int c){
		this.c = c;
		System.out.println(super.a);
	}
	
	Girmiti(int b , int c){
		super(b,c);
		this.b = 1000;
		this.c = 2000;
	}
	
	void result() {
		System.out.println(a+b+c);
		System.out.println(b);
	}
	
	public void greeting() {
		System.out.println("Thank you");
	}
}


public class ConstructorCalling {

	public static void main(String[] args) {
		
		Girmiti g = new Girmiti(200);
		Girmiti g1 = new Girmiti(400,300);
		g1.result();
		 Company cm = 
	     new Company();
				 
	}

}
