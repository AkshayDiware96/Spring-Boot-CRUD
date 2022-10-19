package com.yash.project.repository;


	import com.yash.project.entity.Product;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface ProductRepository extends JpaRepository<Product,Integer> {
	    Product findByName(String name);
	}

