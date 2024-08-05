package com.example.springbootcrud.springbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud.springbootcrudapi.model.emp;
import com.example.springbootcrud.springbootcrudapi.service.empService;



@RestController
@RequestMapping("/api")
public class EmpController {
	
	
	@Autowired
	private empService EmpSerivce;
	
	@GetMapping("/emp")
	public List<emp> get(){
		return EmpSerivce.get();
		
		
	}
@PostMapping("/emp")
	public emp save(@RequestBody emp EmpObj) {
	EmpSerivce.save(EmpObj);
	return EmpObj;
		
	}
@GetMapping("/emp/{Id}")
public emp get(@PathVariable int Id) {
	emp EmpObj= EmpSerivce.get(Id);
	if(EmpObj==null){
		throw new RuntimeException("Employee with id"+Id+"is not found");
	}
	return EmpObj;
}

@DeleteMapping("/emp/{Id}")
public String delete(@PathVariable int Id) {
	EmpSerivce.delete(Id);
	return "Employee has been deleted with id :"+Id;
}
@PutMapping("/emp")
public emp update(@RequestBody emp EmpObj) {
	EmpSerivce.save(EmpObj);
	return EmpObj;



}
}
