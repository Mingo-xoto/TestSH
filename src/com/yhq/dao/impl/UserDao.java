package com.yhq.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.yhq.dao.IUserDao;
import com.yhq.pojo.User;

@Repository
public class UserDao implements IUserDao{

    @Resource
    protected SessionFactory sessionFactory;
    
    protected Session getSession(){
	return this.sessionFactory.openSession();
    }
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    public void insert(User user) {
	Session session = this.getSession();
	session.save(user);
	session.flush();
    }

    public User select(String id) {
	String hql = "from User where id=?";
	return (User)this.getSession().createQuery(hql).setParameter(0,id).uniqueResult();
    }

}
