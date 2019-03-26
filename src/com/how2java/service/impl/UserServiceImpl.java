package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.UserMapper;
import com.how2java.pojo.User;
import com.how2java.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> listuser() {
		// TODO Auto-generated method stub
		return userMapper.listuser();
	}

	@Override
	public String getPassword(String name) {
		User user = userMapper.getByName(name);
		// TODO Auto-generated method stub
		if(user==null) return null;
		return user.getPassword();
	}

}
