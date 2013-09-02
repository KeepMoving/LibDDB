package com.lib.project.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lib.project.dao.RecordDao;
import com.lib.project.model.Record;

public class RecordDaoImpl extends HibernateDaoSupport implements RecordDao 
{
	public void insertRecord(Record record) 
	{
		System.out.println("getId = " + record.getId());
		System.out.println("getReaderID = " + record.getReaderID());
		System.out.println("getBookID = " + record.getBookID());
		System.out.println("getBorrowTime = " + record.getBorrowTime());
		System.out.println("getAsk_backTime = " + record.getAsk_backTime());
		System.out.println("getOperator = " + record.getOperator());
		System.out.println("getIsBack = " + record.getIsBack());
		System.out.println("getReal_backTime = " + record.getReal_backTime());
		System.out.println("getLocation = " + record.getLocation());
		
		this.getHibernateTemplate().save(record);
	}

	public List<Record> listRecord() 
	{
		String sql = "from Record";
		return (List<Record>)this.getHibernateTemplate().find(sql);
	}

	public void updateRecord(Record record) 
	{
		this.getHibernateTemplate().update(record);
	}

	public List<Record> listRecordByReaderID(int readerID) 
	{
        String hql="from Record record where record.readerID=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,readerID);                     
        System.out.println(hql);
        List<Record> rList = query.list();
        System.out.println("readerID = " + readerID);
        return rList;
	}

	public List<Record> listRecordByCondition(int readerID, int bookID) 
	{
		String hql="from Record record where record.readerID=? and record.bookID=?";
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,readerID);                     
        query.setParameter(1,bookID);                     
        System.out.println(hql);
        List<Record> rList = query.list();
        System.out.println("readerID = " + readerID);
        System.out.println("bookID = " + bookID);
        return rList;
	}

	public Record getRecordByID(int id) 
	{
        String hql="from Record record where record.id=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,id);                     
        System.out.println(hql);
        List<Record> rList = query.list();
        System.out.println("check point1");
        System.out.println("id = " + id);
        Record recordObj = rList.get(0);
        System.out.println("check point2");
        if(recordObj == null)
        {
        	System.out.println("recordObj == null");
        }
        return recordObj;
	}	
	
}
