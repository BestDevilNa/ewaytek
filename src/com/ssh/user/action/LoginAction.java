package com.ssh.user.action;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.user.dao.UserDao;
import com.ssh.user.model.User;

/**      
 * 类名称：LoginAction    
 * 类描述：用户控制器的实现 
 * 创建人：BestEziealNa    
 * 修改备注：    
 * @version         
 * */  

@Action(value = "loginAction" , results = {
		@Result(name="loginSuccess",location="/loginSuss.jsp"),
		@Result(name="loginFailer",location="/loginFailer.jsp")})
public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = -2266695172069461659L;
	
	@Resource
	
	
	private UserDao userDao;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login(){
		System.out.println(user);
		Date Birthday = user.getBIRTHDAY();
		user = userDao.getUserByUserBirThday(Birthday);
		System.out.println(user);
		return "loginSuccess";
	}
	
}
