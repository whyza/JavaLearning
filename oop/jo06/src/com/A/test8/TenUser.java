package com.A.test8;

public class TenUser {
	private int id;
	private int Pwd;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPwd() {
		return Pwd;
	}
	public void setPwd(int pwd) {
		Pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TenUser(int id,int Pwd,String email) {
		setId(id);
		setPwd(Pwd);
		if(getEmail() == "") {
			setEmail(getId()+"@gameschool.com");
			System.out.println("���䲻��Ϊ��----Ĭ�����䣺"+(getId()+"@gameschool.com"));
		}else {
			setEmail(email);
		}
		System.out.println("ID��"+getId()+"\t����"+getPwd()+"\t���䣺"+getEmail());
	}
	
}
