package com.srj.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srj.Entity.Commercial;
import com.srj.Entity.Residential;



@Repository
public class UserDaoimpl implements UserDao {

	@Autowired
	public SessionFactory sessionFactory;
	

	public Residential Saveinfo(Residential residential ) {

		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(residential);
		
		tr.commit();
		session.close();
		return residential;
	}




	@Override
	public Commercial Save(Commercial commercial) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(commercial);
		
		tr.commit();
		session.close();
		return commercial;
	}}
