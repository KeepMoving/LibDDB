package com.lib.project.service.impl;

import java.util.List;

import com.lib.project.dao.ManagerDao;
import com.lib.project.model.Manager;
import com.lib.project.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
	private ManagerDao managerDao;
	
	public ManagerDao getManagerDao() {
		return managerDao;
	}

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}

	public List<Manager> listManager() {
		return this.managerDao.listManager();
	}

	public void addManager(Manager manager) {
		this.managerDao.insertManager(manager);
	}

	public Manager getManager(String loginName, String password) {
		return this.managerDao.getManager(loginName, password);
	}

	public void deleteManager(int managerID) {
		this.managerDao.deleteManager(managerID);
	}
}
