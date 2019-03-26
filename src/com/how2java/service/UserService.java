package com.how2java.service;

import java.util.List;

import com.how2java.pojo.User;

public interface UserService {
	 List<User> listuser();
	 
	 public String getPassword(String name);
}
