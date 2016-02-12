package com;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.session.transaction.Transaction;

public class Main {
public static void main(String[] args) {
	SessionFactory sessionFactory = new SessionFactory("com.model");
	Session session = sessionFactory.openSession("http://localhost:7474");
	Transaction tx = session.beginTransaction();


	try {
	 //process
	    tx.commit();
	}
	catch (Exception e) {
	    tx.rollback();
	}
	tx.close();
}
}
