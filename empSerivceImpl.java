package com.example.springbootcrud.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootcrud.springbootcrudapi.dao.empdeo;
import com.example.springbootcrud.springbootcrudapi.model.emp;

@Service
public class empSerivceImpl implements empService {
@Autowired
	private empdeo Empdeo;
	
	@Transactional
	@Override
	public List<emp> get() {
return Empdeo.get();
		
	}
	@Transactional
	@Override
	public emp get(int Id) {
		return Empdeo.get(Id);
		
	}
	@Transactional
	@Override
	public void save(emp Emp) {
		Empdeo.save(Emp);
		
	}
	@Transactional
	@Override
	public void delete(int Id) {
		Empdeo.delete(Id);
		
	}

}
