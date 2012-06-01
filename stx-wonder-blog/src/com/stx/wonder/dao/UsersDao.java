package com.stx.wonder.dao;

import java.util.List;
import com.stx.wonder.entity.Users;

public interface UsersDao {
	public List getUsersList();

	public void addUsers(Users Users);

	public void delUsers(int id);

	public Users getUsers(int id );

	public void updateUsers(Users Users);
}
