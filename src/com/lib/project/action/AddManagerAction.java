package com.lib.project.action;

import com.lib.project.model.Manager;
import com.lib.project.service.ManagerService;
import com.opensymphony.xwork2.ActionSupport;

public class AddManagerAction extends ActionSupport {
	private ManagerService managerService;
	private int managerID;
	private String managerName;
	private String password;
	private int typeId;
	public ManagerService getManagerService() {
		return managerService;
	}
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Add a new manager================");
		Manager tempManager = new Manager();
		tempManager.setManagerID(managerID);
		tempManager.setManagerName(managerName);
		tempManager.setPassword(password);
		tempManager.setTypeId(typeId);
		
		this.managerService.addManager(tempManager);
		return "addManagerSuccess";
	}
}
