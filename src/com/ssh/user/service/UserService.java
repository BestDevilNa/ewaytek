package com.ssh.user.service;

import java.util.Date;
import java.util.List;

import com.ssh.user.model.User;

/**
 * 类名称：UserService    
 * 类描述：用户业务逻辑接口 
 * 创建人：BestEziealNa    
 * 修改备注：    
 * @version   
 */
public interface UserService {
	/** 
     * 判断用户是否存在 
     * @param userName 
     * @return user 
     * @  
     * */  
    public boolean isExitUser(String PNAME) ;  
      
    /** 
     * 判断用户是否存在 
     * @param userName passWord 
     * @return user 
     * @  
     * */  
    public boolean isExitByNameAndPass(User user) ;  
      
    /** 
     * 保存用户 
     * @param user 
     * @return boolean 
     * @  
     * */  
    public void save(User user) ;  
      
    /** 
     * 查询所有用户 
     * @param  
     * @return List<User> 
     * @  
     * */  
    public List<User> getUsers() ;  
    /** 
     * 删除用户 
     * @param userId 
     * @return  
     * @  
     * */  
    public void del(int NO) ;  
      
    /** 
     * 修改用户 
     * @param user 
     * @return  
     * @  
     * */  
    public void update(User user) ;  
      
    /** 
     * 根据id获得user 
     * @param userId 
     * @return user 
     * @  
     * */  
    public User getUserById(int NO) ;
    
    /** 
     * 根据日期获得user 
     * @param userId 
     * @return  user 
     * @  
     * */   
    public User getUserByUserBirThday(Date BirThday);
}
