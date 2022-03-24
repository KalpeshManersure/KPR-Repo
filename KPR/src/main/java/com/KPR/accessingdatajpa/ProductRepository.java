package com.KPR.accessingdatajpa;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.KPR.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>  {
	  ArrayList<Product> findAll();
      ArrayList<Product> findByName(String name);
	  Product findById(int id);
}
