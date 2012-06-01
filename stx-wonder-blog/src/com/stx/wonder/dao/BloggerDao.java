package com.stx.wonder.dao;

import java.util.List;


import com.stx.wonder.entity.Blogger;

public interface BloggerDao {
	 public List getBloggerList();
	   public void add(Blogger blogger);
	   public void delBlogger(int bid);
	   public void update(Blogger blogger);
	   public Blogger getBlogger(int bid);
}
