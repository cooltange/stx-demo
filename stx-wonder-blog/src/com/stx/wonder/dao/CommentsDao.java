package com.stx.wonder.dao;

import java.util.List;

import com.stx.wonder.entity.Comments;

public interface CommentsDao {
	public List getCommentsList();

	public void addComments(Comments Comments);

	public void delComments(int id);

	public Comments getComments(int id );

	public void updateComments(Comments Comments);
}
