package com.stx.wonder.dao;

import java.util.List;

import com.stx.wonder.entity.Blogfavorite;
import com.stx.wonder.entity.Blogger;

public interface BlogfavoriteDao {
   public List getBlogFavoriteList();
   public void add(Blogfavorite blogfavorite);
   public void delBlogfavorite(int id);
   public Blogger getBlogfavorite(int bid);
   public void updateBlogger(Blogger blogger);
}
