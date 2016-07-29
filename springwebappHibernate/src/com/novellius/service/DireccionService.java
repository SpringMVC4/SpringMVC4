package com.novellius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novellius.dao.AdminDao;
import com.novellius.dao.DireccionDao;
import com.novellius.pojo.Admin;
import com.novellius.pojo.Direccion;

@Service
public class DireccionService {

	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private DireccionDao direccionDao;
	
	public void save(Admin admin,Direccion direccion){
      direccion.setAdmin(admin);
      direccionDao.save(direccion);
	}
	
	public List<Admin> findAll(){
        return null;
	}

	
}
