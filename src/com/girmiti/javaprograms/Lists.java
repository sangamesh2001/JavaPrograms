package com.girmiti.javaprograms;


public class Lists {
	protected Object clone()
		    throws CloneNotSupportedException
		     
		    {
		        return super.clone();
		    }
	

	public static void main(String[] args) {
		Lists li = new Lists();
	    try {
			System.out.println((Lists)li.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
