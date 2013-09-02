package com.lib.project.service;

import java.util.List;

import com.lib.project.model.Manager;

public interface ManagerService {
	public List<Manager> listManager();
	public void addManager(Manager manager);
	public Manager getManager(String loginName,String password);
	public void deleteManager(int managerID);

}
