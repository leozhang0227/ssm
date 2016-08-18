package com.leo.zhang.service;

import com.leo.zhang.model.User;

public interface IUserService {
        public User getUserById(int userId);
        public boolean insert(User user);
        public boolean delete(int userId);
   }

