package com.lib.project.action;

import com.lib.project.model.Manager;
import com.lib.project.service.ManagerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindManagerAction extends ActionSupport {
	private ManagerService managerService;
	private String loginName;
	private String password;
	private int managerID;
	public ManagerService getManagerService() {
		return managerService;
	}
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================find a certain manager================");
		System.out.println("LoginName = " + loginName);
		System.out.println("password = " + password);
		if(loginName.equals("")||password.equals(""))
		{
			return "nullManagerInfo";
		}
		Manager manager = new Manager();
		manager = managerService.getManager(loginName, password);
		if(manager != null)
		{
			ActionContext context = ActionContext.getContext();   
			context.getSession().put("managerID", manager.getManagerID()); 
			return "findManagerSuccess";
		}else{
			return "findManagerFail";
		}
	}
	
	
}
