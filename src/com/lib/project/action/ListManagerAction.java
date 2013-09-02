package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Manager;
import com.lib.project.service.ManagerService;
import com.opensymphony.xwork2.ActionSupport;

public class ListManagerAction extends ActionSupport {
	private ManagerService managerService;
	private List<Manager> mList;
	
	public ManagerService getManagerService() {
		return managerService;
	}
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	public List<Manager> getMList() {
		return mList;
	}
	public void setMList(List<Manager> list) {
		mList = list;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Find all managers================");
		mList = this.managerService.listManager();
		System.out.println("得到数据条目：" + mList.size());
		return "listManagerSuccess";
	}
}
