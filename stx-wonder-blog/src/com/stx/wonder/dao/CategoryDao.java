package com.stx.wonder.dao;

import java.util.List;

import com.stx.wonder.entity.Category;

public interface CategoryDao {
	 public List getCategoryList();
	   public void add(Category category);
	   public void delCategory(int cid);
	   public Category getCategory(int cid);
	   public void updateCategory(Category category);
}
