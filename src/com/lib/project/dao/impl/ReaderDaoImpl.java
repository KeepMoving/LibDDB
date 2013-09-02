package com.lib.project.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lib.project.dao.ReaderDao;
import com.lib.project.model.Reader;

public class ReaderDaoImpl extends HibernateDaoSupport implements ReaderDao {

	public List<Reader> listReader() 
	{
		String sql ="from Reader";
		return (List<Reader>)this.getHibernateTemplate().find(sql);
	}

	public Reader findReaderForLogin(String cardType, String cardNo,String password) 
	{
		System.out.println("cardType = " + cardType);
		System.out.println("cardNo = " + cardNo);
		System.out.println("password = " + password);
		String hql = "from Reader reader where reader.cardType=? and reader.cardNo=? and reader.password=?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, cardType);
		query.setParameter(1, cardNo);
		query.setParameter(2, password);
        System.out.println(hql);
        List<Reader> rList = query.list();
        System.out.println("checkpoint1");
        Reader readerObj = null;
        if(rList.size()>0)
        {
        	readerObj = rList.get(0);
        }
        System.out.println("checkpoint2");
		return readerObj;
	}

	public void insertReader(Reader reader) 
	{
		this.getHibernateTemplate().save(reader);
	}

	public void deleteReader(int readerID) {	
		String sql ="delete from Reader where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", readerID).executeUpdate();
	}

	public void updateReader(Reader reader) {
		this.getHibernateTemplate().update(reader);
	}

	public Reader getReaderByReaderID(int readerID) 
	{
		System.out.println("readerID = " + readerID);
		String hql = "from Reader reader where reader.readerID=?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, readerID);
        System.out.println(hql);
        List<Reader> rList = query.list();
        System.out.println("getReaderByReaderIDCheckpoint1");
        Reader readerObj = null;
        try {
			readerObj = rList.get(0);
		} catch (RuntimeException re) {
			// TODO Auto-generated catch block
			System.out.println("RuntimeException:" + re.getMessage());
		}
        System.out.println("getReaderByReaderIDCheckpoint2");
		return readerObj;
	}

	public Reader getReaderByBarCode(String barCode) {
		System.out.println("barCode = " + barCode);
		String hql = "from Reader reader where reader.barCode=?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, barCode);
        System.out.println(hql);
        List<Reader> rList = query.list();
        System.out.println("getReaderByReaderIDCheckpoint1");
        Reader readerObj = null;
        try {
			readerObj = rList.get(0);
		} catch (RuntimeException re) {
			// TODO Auto-generated catch block
			System.out.println("RuntimeException:" + re.getMessage());
		}
        System.out.println("getReaderByReaderIDCheckpoint2");
		return readerObj;
	}
	
}
