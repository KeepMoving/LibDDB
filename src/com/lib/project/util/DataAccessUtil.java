package com.lib.project.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DataAccessUtil extends HibernateDaoSupport {

	public static void executeSQL(HibernateTemplate hibernateTemplate,String sql)
	{
		final String tempsql = sql;

		hibernateTemplate.execute(new HibernateCallback()
		{
			public Object doInHibernate(Session session) throws HibernateException
			{
				session.createQuery(tempsql).executeUpdate();
				return null;
			}
		});
	}
}
