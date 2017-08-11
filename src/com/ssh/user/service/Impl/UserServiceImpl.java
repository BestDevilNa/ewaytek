package com.ssh.user.service.Impl;

import java.util.Date;
import java.util.List;




import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.user.dao.UserDao;
import com.ssh.user.model.User;
import com.ssh.user.service.UserService;


/**      
 * �����ƣ�UserServiceImpl    
 * ���������û���Ϣ����ҵ���߼��ӿ�ʵ�� 
 * �����ˣ�BestEziealNa
 * �޸ı�ע��    
 * @version         
 * */ 

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	
	public boolean isExitUser(String PNAME) {
		return userDao.isExitByName(PNAME);
	}

	public boolean isExitByNameAndPass(User user) {
		return userDao.isExitByNameAndPass(user);
	}

	public void save(User user) {
		userDao.addUser(user);
	}

	public List<User> getUsers() {
		return userDao.selectUser();
	}

	public void del(int NO) {
		userDao.delUser(NO);
	}

	public void update(User user) {
		userDao.updateUser(user);
	}

	public User getUserById(int NO) {
		return userDao.getUserByUserId(NO);
	}

	public User getUserByUserBirThday(Date BirThday) {
		return userDao.getUserByUserBirThday(BirThday);
	}
	
}
