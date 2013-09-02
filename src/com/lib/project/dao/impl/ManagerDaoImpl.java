package com.lib.project.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lib.project.dao.ManagerDao;
import com.lib.project.model.Manager;

public class ManagerDaoImpl extends HibernateDaoSupport implements ManagerDao {

	public List<Manager> listManager() {
		String sql = "from Manager";
		return (List<Manager>)this.getHibernateTemplate().find(sql);
	}

	public void insertManager(Manager manager) {
		this.getHibernateTemplate().save(manager);
	}

	public Manager getManager(String loginName, String password) {
		String hqlByName = "from Manager where managerName=? and password=?";
		Session sess = this.getSession();
        Query queryByName=sess.createQuery(hqlByName);             
        queryByName.setParameter(0,loginName);                     
        queryByName.setParameter(1,password);
        System.out.println(hqlByName);
        List list=queryByName.list();
        System.out.println("符合Name查询条件的管理员记录有： " + list.size());
		if(list.size()>0)
		{
			return (Manager)list.get(0);
		}
		else{
			return null;
		}
/*		else{
			String hqlByID = "from Manager where managerID=? and password=?";
	        Query queryByID = sess.createQuery(hqlByID);             
	        queryByID.setParameter(0,Integer.parseInt(loginName));                     
	        queryByID.setParameter(1,password);
	        System.out.println(hqlByID);
	        list=queryByID.list();
	        System.out.println("符合ID查询条件的管理员记录有： " + list.size());
	        if(list.size()>0)
	        {
	        	return (Manager)list.get(0);
	        }else{
	        	return null;
	        }
		}*/
	}

	public void deleteManager(int managerID) {
		String sql ="delete from Manager where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", managerID).executeUpdate();
	}
}
