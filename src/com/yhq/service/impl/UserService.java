package com.yhq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhq.dao.IUserDao;
import com.yhq.pojo.User;
import com.yhq.service.IUserService;

@Service("userService")
@Transactional("transactionManager")
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void insert(User user) {
	userDao.insert(user);
    }

    public boolean select(String id) {
	if (userDao.select(id) == null) {
	    System.out.println("This id doesn't exsist");
	    return false;
	}
	return true;
    }
}
