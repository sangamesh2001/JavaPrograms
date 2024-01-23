package com.girmiti.javaprograms;

import java.util.Scanner;

public class ElectricityBillGenerate {
	
	static double generateBill(double volt) {
		int oneVoltPrice = 3;
		
		double cost = volt * oneVoltPrice;
		
		return cost;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the voltage: ");
		
		double volt = sc.nextDouble();
        System.out.println("generating bill...please wait!!");
        
        System.out.println("voltage bill is :"+generateBill(volt)+" rupees");
		sc.close();
	}
}
