package com.ssh.user.dao;

import java.util.Date;
import java.util.List;

import com.ssh.user.model.User;

/**
 * 类名称: UserDao
 * 类描述: 用户控制dao实现数据库操作接口
 * 创建人: BestEziealNa
 * 修改备注:
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
