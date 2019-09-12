package org.websparrow.action;

import org.websparrow.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private static final long serialVersionUID = 4520047631640187733L;
	private String uname;
	private String uemail;
	private String upass;
	private String udeg;
	private String msg = "";
	Admin admin = null;
	int ctr = 0;
	
	@Override
	public String execute() throws Exception{
		admin = new Admin();
		try{
			ctr = admin.registerUser(uname, uemail, upass, udeg);
			if(ctr > 0){
				msg = "Registration Successful!";
			} else{
				msg = "Some error";
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return "REGISTER";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUdeg() {
		return udeg;
	}

	public void setUdeg(String udeg) {
		this.udeg = udeg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}
}