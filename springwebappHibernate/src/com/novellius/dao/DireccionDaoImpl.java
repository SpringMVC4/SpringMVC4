package com.novellius.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.novellius.pojo.Direccion;

@Transactional
@Repository
public class DireccionDaoImpl implements DireccionDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Direccion direccion) {
		getSession().save(direccion);
		
	}

	@Override
	public List<Direccion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




}
