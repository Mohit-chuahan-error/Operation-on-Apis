package com.API.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.API.repositry.*;
import com.API.Entity.Operation;
import com.API.Exception.ResourceNotFoundException;

@Service
public class ServiceImp implements Services {

	@Autowired
	public Repos Repos;
	
	
	@Override//1
	public List<Operation> getdata() {
		// TODO Auto-generated method stub
		return Repos.findAll();
	}

	@Override//2
	public void createdata(Operation dat) {
		// TODO Auto-generated method stub
		Repos.save(dat);
	}

	@Override//3
	public Operation getdatabyId(int id) {
		
		//return Repos.findById(id).orElseThrow();
		return Repos.findById(id).orElseThrow(() -> new ResourceNotFoundException("Data with ID " + id + " not found."));
	
	}

	@Override//4
	
	public List<Operation> getdatabyIdMessage(int id) {
	    Optional<Operation> operation = Repos.findById(id);
	   return operation.map(Collections::singletonList).orElseGet(Repos::findAll);	}
		//return operation.get();

	@Override//5
	public Object getString(Integer id) {
		// TODO Auto-generated method stub
		return Repos.findById(id);
	}

	
		
		 
}










