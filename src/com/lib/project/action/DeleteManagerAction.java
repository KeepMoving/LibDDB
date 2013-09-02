package com.lib.project.action;

import com.lib.project.service.ManagerService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteManagerAction extends ActionSupport {
	private ManagerService managerService;
	private int managerID;
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
	@Override
	public String execute() throws Exception {
		System.out.println("================Delete a certain manager================");
		managerService.deleteManager(managerID);
		return "deleteManagerSuccess";
	}
}
