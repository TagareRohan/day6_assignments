package com.collections.daos;

import java.util.Collection;
import java.util.*;

import com.collections.Invoice;
import com.collections.ifaces.InvoiceDAO;

public class InvoiceDaoImpl implements InvoiceDAO {

	private List<Invoice> invList;
	
	public InvoiceDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		invList=new ArrayList<Invoice>();
	}
	
	@Override
	public Collection<Invoice> findAll() {
		return this.invList;
	}

	@Override
	public boolean add(Invoice ...invoices)
	{
		boolean result=false;
		for (Invoice eachInvoice: invoices)
		{
			this.invList.add(eachInvoice);
			result=true;
		}
		return result;
		
	}
	
	@Override
	public boolean add(Invoice entity) {
		return this.invList.add(entity);
	}

	@Override
	public Invoice findById(int id) {
		
		Invoice invoice=null;
		
		for(Invoice inv:this.invList)
		{
			if (inv.getInvoiceNumber()==id)
			{
				invoice=inv;
			}
		}
		
		return invoice;
	}

	@Override
	public boolean remove(Invoice entity) {
		// TODO Auto-generated method stub
		return this.invList.remove(entity);
	}

	@Override
	public boolean update(Invoice oldInvoice, Invoice newInvoice) {
		// TODO Auto-generated method stub
		boolean result = false;
		//indexOF contains set
		int index=this.invList.indexOf(oldInvoice);
		this.invList.set(index, newInvoice);
		result=true;
		
		return result;
	}


}
