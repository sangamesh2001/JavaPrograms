package com.girmiti.javaprograms;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;





public class ScheduleThredPool {
	
	static class Run implements Runnable{

		@Override
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

	public static void main(String[] args) {
		
       ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //scheduledThreadPool.schedule(new Run(), 5, TimeUnit.SECONDS);
        
       scheduledThreadPool.scheduleAtFixedRate(new Run(), 10, 4, TimeUnit.SECONDS);
	}
}
