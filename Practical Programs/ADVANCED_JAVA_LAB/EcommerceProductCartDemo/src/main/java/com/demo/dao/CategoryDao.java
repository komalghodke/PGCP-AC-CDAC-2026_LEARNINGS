package com.demo.dao;

import java.util.List;

import com.demo.model.Category;

public interface CategoryDao {

	List<Category> findAllCategories();

}
