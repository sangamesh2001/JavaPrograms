package com.girmiti.javaprograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Trigger implements Runnable{
	public void run() {
		System.out.println("Thread is started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread is ended");
	}
}
public class ThreadPool {
     public static void task(ExecutorService executorService) {
    	 for(int i=0;i<10;i++) {
    		 Runnable runnable = new Trigger();
    		 executorService.execute(runnable);
    	 }
     }
	public static void main(String[] args) {
		int process= Runtime.getRuntime().availableProcessors();
		System.out.println(process);
		ExecutorService executorService = Executors.newFixedThreadPool(process);
		task(executorService);
		
		executorService.shutdown();
		while (!executorService.isTerminated()) {
		}
		System.out.println("Successfully completed");
	}

}
