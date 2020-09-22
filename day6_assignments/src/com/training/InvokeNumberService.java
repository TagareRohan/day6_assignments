package com.training;

public class InvokeNumberService implements Runnable {

	private int countUpTo;
	private String threadName;
	private NumberService service;
	
	public InvokeNumberService(int countUpTo, String threadName) {
		super();
		this.countUpTo = countUpTo;
		this.threadName = threadName;
		this.service=new NumberService();
		
		//passing service instance which is runnable to thread class
		//using this
		Thread thread=new Thread(this,threadName);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.service.sumNumbers(countUpTo);
		
	}

}
