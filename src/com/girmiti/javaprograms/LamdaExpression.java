package com.girmiti.javaprograms;

import com.girmiti.javaprograms.Lamda.Expression;

class Lamda{
	
	 class Expression{
		public void fun() {
			System.out.println("fun method");
		}
	}
}

interface Main{
	void run();
}

interface PerimeterOfRectangle1{
	void rect(int len, int width);
	default void fun()
	{
		System.out.println("hii");
	}
}

interface PerimeterOfSquare{
	void Square(int square);
}

interface LamdaExpression {

	public static void main(String[] args) {
		Lamda lm = new Lamda();
	    Expression ex = lm.new Expression();
	    ex.fun();
	    
	    Main m = ()->{
	    	System.out.println("Lamda Expression");
	    };
	    
	    //Parameter Of Rectangle
	    PerimeterOfRectangle1 por = (a,b)->
	    	System.out.println("Rectangle Paramete: "+2*(a+b));
	    	
	    ;
	    por.rect(10, 20);
	    por.fun();
	    
	    
	    //Parameter of Square
	    
	    PerimeterOfSquare pos = (a)->{
	    	System.out.println("Perimeter Square :"+4*a);
	    };
	    
	    pos.Square(23);
	    
	   Runnable r = new Runnable() {
			
			@Override
			public void run() {
                				
			}
		};
	    
	}

}
