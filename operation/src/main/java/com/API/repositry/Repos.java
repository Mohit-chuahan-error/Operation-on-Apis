package com.API.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.Entity.Operation;

public interface Repos extends JpaRepository<Operation, Integer>{

	

	

}
