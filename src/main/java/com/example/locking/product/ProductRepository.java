package com.example.locking.product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : hanjihoon
 * @Date : 2025. 03. 30.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}

