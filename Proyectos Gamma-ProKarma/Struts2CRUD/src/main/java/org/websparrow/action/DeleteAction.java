package org.websparrow.action;

import org.websparrow.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	
	private static final long serialVersionUID = -1405929458563342639L;
	String uemail;
	String msg;
	Admin dao = new Admin();
	
	@Override
	public String execute() throws Exception{
		try{
			int isDeleted = dao.deleteUserDetails(uemail);
			if(isDeleted > 0){
				msg = "Record deleted successfully";
			} else{
				msg = "Error deleting record";
			} 
		} catch (Exception e){
			e.printStackTrace();
		}
		return "DELETE";
	}
	
	public String getUemail(){
		return uemail;
	}
	
	public void setUemail(String uemail){
		this.uemail = uemail;
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}

}
