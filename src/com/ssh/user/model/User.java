package com.ssh.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ������: User
 * ������: �û���Ϣʵ��
 * ������: BestEziealNa
 * �޸ı�ע:
 * @version
 */
  //  @Entity��ʾ��ǰ������һ��ʵ��   @Table(name = "exceltext") ָ�������ӳ�䵽���ݿ����һ����
  //  @Column(name = "userId") ��ʾ�������ӳ�����ݿ��Ӧ�����һ��
@Entity
@Table(name = "test")
public class User {
	/**
	 * �û�ID
	 */
	@Id
	@Column(name = "NO")
	//  @GeneratedValue  :  ��Ҫ�˽� �� ����
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int NO;
	/**
	 * �û���
	 */
	@Column(name = "PNAME",length = 50)
	private String PNAME;
	/**
	 * �û����
	 */
	@Column(name = "PWD",length = 50)
	private String PWD;
	/**
	 * ע������
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
