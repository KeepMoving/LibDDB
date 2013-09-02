package com.lib.project.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lib.project.dao.BookTypeDao;
import com.lib.project.model.BookType;

public class BookTypeDaoImpl extends HibernateDaoSupport implements BookTypeDao {

	public List<BookType> listBookType() {
		String sql ="from BookType";
		return (List<BookType>)this.getHibernateTemplate().find(sql);
	}

	public void insertBookType(BookType bookType) 
	{
		this.getHibernateTemplate().save(bookType);
	}
}
