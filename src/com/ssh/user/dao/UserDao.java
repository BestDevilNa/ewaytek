package com.ssh.user.dao;

import java.util.Date;
import java.util.List;

import com.ssh.user.model.User;

/**
 * ������: UserDao
 * ������: �û�����daoʵ�����ݿ�����ӿ�
 * ������: BestEziealNa
 * �޸ı�ע:
 * @version
 */
public interface UserDao {
	public void addUser(User user);
	
	public void delUser(int NO);
	
	public void updateUser(User user);
	
	public List<User> selectUser();
	
	public User getUserByUserId(int NO);
	
	public boolean isExitByName(String PNAME);
	
	public boolean isExitByNameAndPass(User user);
	
	public User getUserByUserBirThday(Date BirThday);
}
