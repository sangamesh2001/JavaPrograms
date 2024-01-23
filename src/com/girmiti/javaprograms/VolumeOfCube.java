package com.girmiti.javaprograms;

import java.util.Scanner;

public class VolumeOfCube {
	
	public int cubeOfValume(int n1) {
		return n1;
	}
	
	public int cubeOfValume(int n1,int n2) {
		return n2;
	}
	
	public int cubeOfValume(int n1,int n2,int n3) {
		return n3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the valume :");
		int valume = sc.nextInt();
		
		VolumeOfCube obj = new VolumeOfCube();
	    int cube = obj.cubeOfValume(valume) * obj.cubeOfValume(valume,valume) * obj.cubeOfValume(valume, valume, valume);
		System.out.println("cube of valume :"+cube);
	}

}
