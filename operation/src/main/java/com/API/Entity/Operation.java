package com.API.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class Operation {

	@Id
	private int id;
	
	private String name;
	private String last;
	private int Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public int getSalary() {
		return Salary;
	}
	
	@Min(1800)
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Operation(int id, String name, String last, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.last = last;
		this.Salary = salary;
	}
	public Operation() {
		super();
	}
	
}
