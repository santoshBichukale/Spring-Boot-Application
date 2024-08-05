package com.example.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springbootcrud.springbootcrudapi.model.emp;

import jakarta.persistence.EntityManager;
@Repository
public class empdeoImpl implements empdeo {
	
	
	private static final emp EmpObj = null;
	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<emp> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<emp> query=currentSession.createQuery("from emp",emp.class);
		List<emp> list=query.getResultList();
		return list;
	}

	@Override
	public emp get(int Id) {
		Session currentSession = entityManager.unwrap(Session.class);
		emp EmpObj=currentSession.get(emp.class, Id);
		return EmpObj;
	}
	@SuppressWarnings("deprecation")
	@Override
	public void save(emp Emp) {
	Session currentSession = entityManager.unwrap(Session.class);
	currentSession.saveOrUpdate(Emp);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void delete(int Id) {
		Session currentSession = entityManager.unwrap(Session.class);
		emp EmpObj=currentSession.get(emp.class, Id);
		currentSession.delete(EmpObj);
		
	}

}
