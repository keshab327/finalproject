package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enittiy.product;

public interface productRepository extends JpaRepository<product,Integer>{
	List<product> findAllByCategory_Id(int id);
	

//	List<product> findAllById(int id);

}
