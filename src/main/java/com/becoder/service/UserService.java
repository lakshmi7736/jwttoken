package com.becoder.service;

import com.becoder.entity.User;

public interface UserService {

	public User saveUser(User user);

	public User saveAdmin(User user);

	public void removeSessionMessage();

}