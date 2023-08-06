package com.API.service;

import java.util.List;

import com.API.Entity.Operation;

public interface Services {

	List<Operation> getdata(); //1

	void createdata(Operation dat);//2

	Operation getdatabyId(int id);//3

	List<Operation> getdatabyIdMessage(int id);//4

	Object getString(Integer id);//5


	


	

}
