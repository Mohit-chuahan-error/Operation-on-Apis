package com.API.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.API.Entity.Operation;
import com.API.repositry.Repos;
import com.API.service.Services;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
public class Controller {
	
	
	
	@Autowired
	public Services Service;
	
	
	@GetMapping("data")//1
	public ResponseEntity<List<Operation>> getdata(){
		List<Operation> Ar= Service.getdata();
		return new ResponseEntity<List<Operation>>(Ar,HttpStatus.OK);
	}
	
	@PostMapping("data")//2
	public String createdata(@Valid @RequestBody Operation dat) {
		 Service.createdata(dat);
		 return "data insered ";
		
	}
	
	@GetMapping("data/{id}")//3
	public Operation getdatabyId(@PathVariable int id){
		return Service.getdatabyId(id);
	}
	

	
	@GetMapping("/your-api/{id}")//4
    public ResponseEntity<List<Operation>> getDataById(@PathVariable int id) {
		List<Operation> customResponse = Service.getdatabyIdMessage(id);
        return ResponseEntity.ok(customResponse);
    }
	
	@Autowired
	public Repos Repos;
	
	 @GetMapping("/operation/{id}")//5
	    public ResponseEntity<?> getOperationById(@PathVariable int id) {
		 Optional<Operation> operation = Repos.findById(id);
	        if (operation.isPresent()) {
	            return ResponseEntity.ok(Service.getString(id));
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Please Enter the Valid Id");
	        }
	 }
	 
	// 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
	
	        
}
