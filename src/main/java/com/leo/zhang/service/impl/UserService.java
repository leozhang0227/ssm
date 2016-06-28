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

	@Resource
    private UserMapper userDao;
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
	

}
