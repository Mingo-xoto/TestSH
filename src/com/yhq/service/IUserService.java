package com.yhq.service;

import com.yhq.pojo.User;

public interface IUserService {

    public void insert(User user);
    public boolean select(String id);
}
