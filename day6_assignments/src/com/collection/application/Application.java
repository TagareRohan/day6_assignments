package com.collection.application;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.management.OperationsException;

import com.collection.daos.InvoiceDaoImpl;
import com.collections.Invoice;
import com.collections.ifaces.InvoiceDAO;

public class Application{
	
	public static void printList(Collection<Invoice> invList)
	{
		Iterator<Invoice> iterator = invList.iterator();
		
		while(iterator.hasNext())
		{
			Invoice inv=iterator.next();
			System.out.println(inv);
		}
	}
	
	public static void main(String[] args)
	{
		Invoice ram=new Invoice(100,"ram",1000.0);
		Invoice sam=new Invoice(200,"sam",2000.0);
		Invoice dam=new Invoice(300,"dam",3000.0);
		
		InvoiceDAO dao=new InvoiceDaoImpl();
		dao.add(ram,sam);
		dao.add(dam);
		
		Collection<Invoice> invList = dao.findAll();
		
		printList(invList);
		
		dao.remove(ram);
		
		System.out.println("After");
		
		printList(invList);
		
		Invoice sam1=new Invoice(400,"sam",4000.0);
		
		dao.update(sam, sam1);
		
		System.out.println("After");
		
		printList(invList);
		
		System.out.println(dao.findById(300));
		
		
		
		FileOperations fileOper =new FileOperations();
		
		File file=new File("invoice.txt");
		
		Thread thread1 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                { 
                    fileOper.readFromFile(file); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
		
		Thread thread2 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                fileOper.writeToFile(file, invList);
            } 
        }); 
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	


}
