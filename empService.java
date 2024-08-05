package com.example.springbootcrud.springbootcrudapi.service;

import java.util.List;

import com.example.springbootcrud.springbootcrudapi.model.emp;

public interface empService {

	
List<emp>get();
emp get(int Id);

void save(emp Emp);
void delete(int Id);
}
