package com.training;

public class NumberService {

	
	public void sumNumbers(int countTo)
	{
		int count =0;
		for(int i=0;i<countTo;i++)
		{
			count=count+i;
		}
		System.out.println("count upto "+countTo+"total "+count+"called by "+Thread.currentThread().getName());
	}
}
