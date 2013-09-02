package com.lib.project.dao;

import java.util.List;

import com.lib.project.model.Manager;

public interface ManagerDao {
	public List<Manager> listManager();
	public void insertManager(Manager manager);
	public Manager getManager(String loginName,String password);
	public void deleteManager(int managerID);
}
