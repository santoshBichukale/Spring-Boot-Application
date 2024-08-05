package com.example.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import com.example.springbootcrud.springbootcrudapi.model.emp;

public interface empdeo {
	
List<emp>get();
emp get(int Id);

void save(emp Emp);
void delete(int Id);

}
