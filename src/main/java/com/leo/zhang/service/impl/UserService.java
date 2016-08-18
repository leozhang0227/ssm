package com.leo.zhang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.leo.zhang.dao.UserMapper;
import com.leo.zhang.model.User;
import com.leo.zhang.service.IUserService;

@Service("userService")
@Repository
public class UserService implements IUserService{

	@Override
	public boolean delete(int userId) {
		this.userDao.deleteByPrimaryKey(userId);
		return true;
	}
	@Resource
    private UserMapper userDao;
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public boolean insert(User user) {
		this.userDao.insert(user);
		return true;
	}
	

}
