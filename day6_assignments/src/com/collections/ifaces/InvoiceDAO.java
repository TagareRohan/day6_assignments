package com.collections.ifaces;

import java.util.*;
import com.collections.*;

public interface InvoiceDAO {

	Collection<Invoice> findAll();
	boolean add(Invoice entity);
	Invoice findById(int id);
	boolean add(Invoice... invoices);
	boolean remove(Invoice entity);
	boolean update(Invoice oldInvoice,Invoice newInvoice);
	
}
