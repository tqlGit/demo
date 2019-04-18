package com.example.entity;

import java.util.Date;

public class PersonInfo {
	private Integer pid;
	private String pname;
	private String mobile;
	private Date birthday;
	private String infoDescribe;
	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonInfo(Integer pid, String pname, String mobile, Date birthday, String infoDescribe) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.birthday = birthday;
		this.infoDescribe = infoDescribe;
	}
	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the infoDescribe
	 */
	public String getInfoDescribe() {
		return infoDescribe;
	}
	/**
	 * @param infoDescribe the infoDescribe to set
	 */
	public void setInfoDescribe(String infoDescribe) {
		this.infoDescribe = infoDescribe;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", birthday=" + birthday
				+ ", infoDescribe=" + infoDescribe + "]";
	}
	
	
	
}
