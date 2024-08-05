package com.example.springbootcrud.springbootcrudapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="new_table")
public class emp {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
private Integer Id;
	@Column(name="name")
private String Name;
	@Column(name="email")
private String Email;
	@Column(name="department")
	private String Department;
	@Column(name="position")
private String Position;
	public Integer Id() {
		return Id;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDepartmen() {
		return Department;
	}
	public void setDepartmen(String department) {
		Department = department;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	@Override
	public String toString() {
		return "emp [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Department=" + Department + ", Position="
				+ Position + "]";
	}
	
	
}
