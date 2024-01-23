package com.girmiti.javaprograms;

import java.security.Provider.Service;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

interface Airoplane{
	void takeUp();
	int speed();
}

//interface AirCraft extends Airoplane{
//	void height();
//}
//
//interface Ex extends ExecutorService{
//	
//}

public class InterfacePolymorphism {

	public static void main(String[] args) {
        Runnable risk = ()->{
        	System.out.println("task exceuted by thread"+ Thread.currentThread().getPriority());
        };
        
        //Fixed Thread Pool
        int countCore = Runtime.getRuntime().availableProcessors();
        ExecutorService ev = Executors.newFixedThreadPool(countCore);
        System.out.println(ev);
        System.out.println(countCore);
        
        //Cached Thread pool(Synchronous) 
        ExecutorService serve = Executors.newCachedThreadPool();
        
        //Schedule Thread pool
        ScheduledExecutorService serve1 = Executors.newScheduledThreadPool(countCore);
        //Run after 10 seconds  
        serve1.schedule(new Task(), 5, TimeUnit.SECONDS);
        
        //Before wait start wait 5 seconds then repeatedly Run every 3 seconds 
       serve1.scheduleAtFixedRate(new Task(), 5, 3, TimeUnit.SECONDS);
        
      //Task is run repeatedly every 10 seconds previous to run
        serve1.scheduleWithFixedDelay(new Task(), 10, 3, TimeUnit.SECONDS);
        
        
        
//        for (int i = 0; i < 10; i++) {
//			serve1.execute(new Task());
//		}
	}
	static class Task implements Runnable{
		public void run() {
			System.out.println("Interface ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		}
	}

}
