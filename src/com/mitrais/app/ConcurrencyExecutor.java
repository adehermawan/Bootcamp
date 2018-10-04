package com.mitrais.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExecutor {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
		};
		pool.execute(task);
		pool.shutdown();
	}
}
