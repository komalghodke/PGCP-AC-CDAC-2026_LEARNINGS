package com.demo.service;

import java.util.List;

import com.demo.dao.CategoryDao;
import com.demo.dao.CategoryDaoImpl;
import com.demo.model.Category;

public class CategoryServiceImpl implements CategoryService {

	private CategoryDao cdao ;
	
	public CategoryServiceImpl() {
		this.cdao = new CategoryDaoImpl();
	}

	@Override
	public List<Category> getAllCategories() {
		return cdao.findAllCategories();
	}

}
