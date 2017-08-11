package com.ssh.user.service;

import java.util.Date;
import java.util.List;

import com.ssh.user.model.User;

/**
 * �����ƣ�UserService    
 * ���������û�ҵ���߼��ӿ� 
 * �����ˣ�BestEziealNa    
 * �޸ı�ע��    
 * @version   
 */
public interface UserService {
	/** 
     * �ж��û��Ƿ���� 
     * @param userName 
     * @return user 
     * @  
     * */  
    public boolean isExitUser(String PNAME) ;  
      
    /** 
     * �ж��û��Ƿ���� 
     * @param userName passWord 
     * @return user 
     * @  
     * */  
    public boolean isExitByNameAndPass(User user) ;  
      
    /** 
     * �����û� 
     * @param user 
     * @return boolean 
     * @  
     * */  
    public void save(User user) ;  
      
    /** 
     * ��ѯ�����û� 
     * @param  
     * @return List<User> 
     * @  
     * */  
    public List<User> getUsers() ;  
    /** 
     * ɾ���û� 
     * @param userId 
     * @return  
     * @  
     * */  
    public void del(int NO) ;  
      
    /** 
     * �޸��û� 
     * @param user 
     * @return  
     * @  
     * */  
    public void update(User user) ;  
      
    /** 
     * ����id���user 
     * @param userId 
     * @return user 
     * @  
     * */  
    public User getUserById(int NO) ;
    
    /** 
     * �������ڻ��user 
     * @param userId 
     * @return  user 
     * @  
     * */   
    public User getUserByUserBirThday(Date BirThday);
}
