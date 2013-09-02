package com.lib.project.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lib.project.dao.ReaderTypeDao;
import com.lib.project.model.ReaderType;

public class ReaderTypeDaoImpl extends HibernateDaoSupport implements ReaderTypeDao {

	public List<ReaderType> listReaderType() {
		String sql = "from ReaderType";
		return (List<ReaderType>)this.getHibernateTemplate().find(sql);
	}

}
