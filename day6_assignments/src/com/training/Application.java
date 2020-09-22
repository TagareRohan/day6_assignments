package com.training;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		new InvokeNumberService(1,"one");
		new InvokeNumberService(2,"two");
		new InvokeNumberService(3,"three");
		
		try {
			System.out.println("enter");
			int key=(Integer)System.in.read();
			System.out.println(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
