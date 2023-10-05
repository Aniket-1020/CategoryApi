package com.ecommercewebsite.ecommerce1.repository;
import java.util.Locale.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{
	Category findByCategoryName(String categoryName);
	
}
