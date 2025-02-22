package com.sourav.Hotel.Management.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="User_Info")
public class UserInfoDo {
	
	
	@Id
	@Column
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userid;
		
	private String Name;
	private String Addhar_no;
	private char sex;
	private String DoB;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUser_ID(int userid) {
		userid = userid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddhar_no() {
		return Addhar_no;
	}
	public void setAddhar_no(String addhar_no) {
		Addhar_no = addhar_no;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		DoB = doB;
	}
	
	
	@Override
	public String toString() {
		return "UserInfoDo [userid=" + userid + ", Name=" + Name + ", Addhar_no=" + Addhar_no + ", sex=" + sex
				+ ", DoB=" + DoB + "]";
	}

}
