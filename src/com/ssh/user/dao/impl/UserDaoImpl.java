package com.ssh.user.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssh.user.dao.UserDao;
import com.ssh.user.model.User;
import com.ssh.util.BaseDao;


/**
 * 类名称: UserDaoImpl
 * 类描述: 用户控制dao实现数据库操作接口
 * 创建人: BestEziealNa
 * 修改备注: 
 * @version
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao {

	public void addUser(User user) {
		Session session = this.getSessionFactory().openSession();
		Transaction tc  = (Transaction)session.beginTransaction();
		session.save(user);
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
	}

	public void delUser(int NO) {
		Session session = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		User u = new User(NO);
		session.delete(u);
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
	}

	public void updateUser(User user) {
		Session session = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		session.update(user);
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
	}

	public List<User> selectUser() {
		List<User> users = new ArrayList<User>();
		Session session = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		List list = session.createQuery("From User").list();
		for(Iterator iterator = list.iterator(); iterator.hasNext();){
			User u = (User) iterator.next();
			users.add(u);
		}
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		return users;
	}

	public User getUserByUserId(int NO) {
		Session session = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		// load 是说明数据库中一定存在这条记录,没有则报出:ObjectNotFoundException 
		// get  如果查不到记录,返回的是一个Null
		User user = (User)session.get(User.class,NO);
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		return user;
	}
	
	
	 //  关于Hibernate Session 查询的问题！
	public User getUserByUserBirThday(Date BirThday) {
		Session session = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		// load 是说明数据库中一定存在这条记录,没有则报出:ObjectNotFoundException 
		// get  如果查不到记录,返回的是一个Null
		User user = (User)session.get(User.class, BirThday);
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		return user;
	}

	public boolean isExitByName(String PNAME) {
		Session session = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		List user = (List)session.createQuery("From User u where u.PNAME=:PNAME").setString("PNAME", PNAME).list();
		if(user.size()>0){
			try{
				tc.commit();
			}catch(Exception e){
				e.printStackTrace();
			}
			session.close();
			return true;
		}
		try{
			tc.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		return false;
	}

	public boolean isExitByNameAndPass(User user) {
		Session session  = this.getSessionFactory().openSession();
		Transaction tc = (Transaction)session.beginTransaction();
		List users = session.createQuery("From User u where u.PNAME=:PNAME and u.PWD=:PWD").setString("PNAME",user.getPNAME()).setString("PWD",user.getPWD()).list();
		System.out.println(users.size());
		if(users.size()>0){
			try {
				tc.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			session.close();
			return true;
		}
		try {
			tc.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return false;
	}
	
}
