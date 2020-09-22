package com.training;

import java.io.IOException;

public class ThreadJoinExample {

	
	public static void main(String[] args)
	{
		
		System.out.println(Thread.currentThread().getName()+" started");
		Thread thread =new Thread()
		{

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" start");
				// TODO Auto-generated method stub
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+" stop");
			}
			
		};
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" stop");
	}
}
