package com.ecommercewebsite.ecommerce1.service;

import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommercewebsite.ecommerce1.repository.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepo categoryRepo;
	
	public void createCategory(Category category) {
	categoryRepo.save(category);
	}
}
