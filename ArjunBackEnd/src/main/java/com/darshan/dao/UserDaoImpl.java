package com.darshan.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darshan.model.User;


@Repository
public class UserDaoImpl implements UserDao {
@Autowired
private SessionFactory sessionFactory;

	public User registerUser(User user) {
        Session session=sessionFactory.openSession();
        session.save(user);
        session.flush();
        session.close();
        return user;
	}
	
	public User login(User user) {
		Session session=sessionFactory.openSession();
		//select * from user_batch15 where username=user.getUsername() and password=user.getPassword()
		Query query=session.createQuery("from User where username=? and password=?");
		//from user where username='john' and password='123'
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		User validUser=(User)query.uniqueResult();
		return validUser;
		
	}

	public void updateUser(User user) {
		Session session=sessionFactory.openSession();
		//update user_batch15 set username=?,password=?,email=?,enabled=?,online=? where id=?
		session.update(user);
		session.flush();
		session.close();
	}

	public User getUser(int id) {
		Session session=sessionFactory.openSession();
		User user=(User)session.get(User.class, id);
		session.close();
		return user;
	}

}