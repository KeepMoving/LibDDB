package com.lib.project.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lib.project.dao.BookDao;
import com.lib.project.model.Book;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao 
{
	public List<Book> listBook() 
	{
		String sql ="from Book";
		return (List<Book>)this.getHibernateTemplate().find(sql);
	}

	public void insertBook(Book book) 
	{
		this.getHibernateTemplate().save(book);
	}

	public Book getBookByBookID(int bookID) 
	{
        String hql="from Book book where book.bookID=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,bookID);                     
        System.out.println(hql);
        List<Book> bList = query.list();
        System.out.println("check point1");
        System.out.println("bookID = " + bookID);
        Book bookObj = null;
        try {
			bookObj = bList.get(0);
		} catch (RuntimeException re) {
			// TODO Auto-generated catch block
	        System.out.println("check point2");
			System.out.println("RuntimeException:" + re.getMessage());
		}
        return bookObj;
	}

	public Book getBookByBarcode(String barcode) {
		String hql = "from Book book where book.barCode=?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, barcode);
        System.out.println(hql);
        List<Book> bList = query.list();
        Book bookObj = null;
    	try {
			bookObj = bList.get(0);
		} catch (RuntimeException re) {
			// TODO Auto-generated catch block
			System.out.println("RuntimeException:" + re.getMessage());
		}
		return bookObj;
	}

	public List<Book> getBookByAuthor(String author) {
		Session sess = this.getSession();
		sess.beginTransaction();
		String strSQL="from Book as b where b.author like :condition"; 
		Query query = sess.createQuery(strSQL);  
		query.setString("condition", "%"+author+"%"); 
		List<Book> result= query.list(); 
		sess.getTransaction().commit();   
		return result;
	}

	public List<Book> getBookByBookName(String bookName) {
		Session sess = this.getSession();
		sess.beginTransaction();
		String strSQL="from Book as b where b.bookName like :condition"; 
		Query query = sess.createQuery(strSQL);  
		query.setString("condition", "%"+bookName+"%"); 
		List<Book> result= query.list(); 
		sess.getTransaction().commit();   
		return result;
	}

	public List<Book> getBookByPulisher(String publisher) {
		Session sess = this.getSession();
		sess.beginTransaction();
		String strSQL="from Book as b where b.publisher like :condition"; 
		Query query = sess.createQuery(strSQL);  
		query.setString("condition", "%"+publisher+"%"); 
		List<Book> result= query.list(); 
		sess.getTransaction().commit();   
		return result;
	}

	public List<Book> getBookByIndexNo(String indexNo) {
		Session sess = this.getSession();
		sess.beginTransaction();
		String strSQL="from Book as b where b.publisher like :condition"; 
		Query query = sess.createQuery(strSQL);  
		query.setString("condition", "%"+indexNo+"%"); 
		List<Book> result= query.list(); 
		sess.getTransaction().commit();   
		return result;
	}

	public List<Book> getBookByIsbn(String isbn) {
		Session sess = this.getSession();
		sess.beginTransaction();
		String strSQL="from Book as b where b.publisher like :condition"; 
		Query query = sess.createQuery(strSQL);  
		query.setString("condition", "%"+isbn+"%"); 
		List<Book> result= query.list(); 
		sess.getTransaction().commit();   
		return result;
	}

	public void deleteBook(int bookID)
	{
		String sql ="delete from Book where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", bookID).executeUpdate();
	}

	public void updateBook(Book book) 
	{
		this.getHibernateTemplate().update(book);	
	}
}
