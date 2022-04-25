package com.sapient.endur.ui;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		//Classic style
		Thread t1 = new Thread( ()->{
			//thread-0
			System.out.println(Thread.currentThread().getName());
			});
		t1.start();
		
		
		
		//Concurrency 
		//Executors is an utily class
		//Thread pool with only single thread
		Executor executor= Executors.newSingleThreadExecutor();
		executor.execute(  ()->{
			//executing task
			//pool-1-thread-1
			System.out.println(Thread.currentThread().getName());
		}    );
	}

}
