package com.yhq.dao;

import com.yhq.pojo.User;

public interface IUserDao {
    public void insert(User user);
    public User select(String id);
}
