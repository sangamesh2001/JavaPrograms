package com.girmiti.task;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateAndTimeAPI {

	public static void main(String[] args) {
       LocalDate date = LocalDate.now();
       System.out.println(date);
       
       LocalDate of = LocalDate.of(2012,3, 19);
       System.out.println(of);
       LocalDate localDate = LocalDate.parse("2022-01-16");
       System.out.println(localDate);
       
        LocalDate of2 = LocalDate.of(date.getYear(), Month.JANUARY, date.getDayOfMonth());
        System.out.println(of2);
        
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the year : ");
//        int n = sc.nextInt();
//        Year of3 = Year.of(n);
//        if(of3.isLeap())
//        	System.out.println("Yes");
//        else
//            System.out.println("No");
        
        
      //zone
    	ZoneId zone = ZoneId.systemDefault();
    	System.out.println(zone);
    	
    	//how to know other country time zone
    	//America
    	ZoneId us = ZoneId.of("America/Los_Angeles"); 
    	ZonedDateTime t =ZonedDateTime.now(us);
    	System.out.println(t);
    	
    	//japan
    	ZoneId japan = ZoneId.of("Asia/Tokyo"); 
    	ZonedDateTime t1 =ZonedDateTime.now(japan);
    	System.out.println(t1);
    	
    	//"Australia/Sydney"
    	ZoneId au = ZoneId.of("Australia/Sydney"); 
    	ZonedDateTime t2 =ZonedDateTime.now(au);
    	System.out.println(t2);
    	
    	ZoneId india = ZoneId.of("Asia/Kolkata"); 
    	ZonedDateTime t3 =ZonedDateTime.now(india);
    	System.out.println(t3);
    	
    	ZoneId z = ZoneId.systemDefault();
    	
    	System.out.println(z);
    	
	}
    
}
