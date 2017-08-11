package com.ssh.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 类名称: User
 * 类描述: 用户信息实体
 * 创建人: BestEziealNa
 * 修改备注:
 * @version
 */
  //  @Entity表示当前的类是一个实体   @Table(name = "exceltext") 指定这个类映射到数据库的哪一个表
  //  @Column(name = "userId") 表示这个属性映射数据库对应表的那一列
@Entity
@Table(name = "test")
public class User {
	/**
	 * 用户ID
	 */
	@Id
	@Column(name = "NO")
	//  @GeneratedValue  :  需要了解 和 扩充
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int NO;
	/**
	 * 用户名
	 */
	@Column(name = "PNAME",length = 50)
	private String PNAME;
	/**
	 * 用户编号
	 */
	@Column(name = "PWD",length = 50)
	private String PWD;
	/**
	 * 注册日期
	 */
	@Column(name = "BIRTHDAY")
	private Date BIRTHDAY;
	public int getNO() {
		return NO;
	}
	public void setNO(int nO) {
		NO = nO;
	}
	public String getPNAME() {
		return PNAME;
	}
	public void setPNAME(String pNAME) {
		PNAME = pNAME;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String Pwd) {
		PWD = Pwd;
	}
	public Date getBIRTHDAY() {
		return BIRTHDAY;
	}
	public void setBIRTHDAY(Date bIRTHDAY) {
		BIRTHDAY = bIRTHDAY;
	}
	
	public User(int NO,String PNAME,String PWD,Date BIRTHDAY){
		this.NO = NO;
		this.PNAME = PNAME;
		this.PWD = PWD;
		this.BIRTHDAY = BIRTHDAY;
	}
	
	public User(int NO,String PNAME,String PWD){
		this.NO = NO;
		this.PNAME = PNAME;
		this.PWD = PWD;
	}
	
	public User(int NO,String PNAME){
		this.NO = NO;
		this.PNAME = PNAME;
	}
	
	public User(int NO){
		this.NO = NO;
	}
	
	public User() {
		
	}
	@Override
	public String toString() {
		return "model [NO=" + NO + ", PNAME=" + PNAME + ", PWD=" + PWD
				+ ", BIRTHDAY=" + BIRTHDAY + "]";
	}
}
