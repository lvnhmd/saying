package com.saying.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saying.domain.Saying;

@Repository
public class SayingDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Saying getRandomSaying() {
		Session session = sessionFactory.getCurrentSession();
		Saying saying = (Saying) session.createQuery(
				" from Saying order by RAND() ").setMaxResults(1).uniqueResult();
		return saying;
	}
}
