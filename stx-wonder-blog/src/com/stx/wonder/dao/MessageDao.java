package com.stx.wonder.dao;

import java.util.List;

import com.stx.wonder.entity.Message;
public interface MessageDao {
	public List getMessageList();

	public void addMessage(Message message);

	public void delMessage(int mid);

	public Message getMessage(int mid );

	public void updateMessage(Message message);
}
