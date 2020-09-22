package com.collection.application;

import java.io.*;
import java.util.*;

import com.collections.Invoice;

public class FileOperations  {

	
	public synchronized void writeToFile(File file, Collection<Invoice> invList)
	{
		
		System.out.println("Started writing");
		
		PrintWriter writer=null;
		try {
			writer = new PrintWriter(new FileWriter(file,true));
			
			for (Invoice inv:invList)
			{
				writer.println(inv.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			writer.close();
		}
		
		System.out.println("Finished writing");
		
		notify();
	}
	
	
	public synchronized void readFromFile(File file) throws InterruptedException
	{
		String line=null;
		
		System.out.println("Waiting");
		
		wait();
		
		System.out.println("Started reading");
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) 
			{

				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finished reading");
		
		
	}
	
	
}
