package com.lib.project.service.impl;

import java.util.List;

import com.lib.project.dao.BookDao;
import com.lib.project.model.Book;
import com.lib.project.service.BookService;

public class BookServiceImpl implements BookService
{
	private BookDao bookDao;
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public List<Book> listBook() 
	{
		return bookDao.listBook();
	}

	public void addBook(Book book) 
	{
		this.bookDao.insertBook(book);
	}

	public Book getBookByBarcode(String barcode) 
	{
		return this.bookDao.getBookByBarcode(barcode);
	}

	public Book getBookByBookID(int bookID) 
	{
		return this.bookDao.getBookByBookID(bookID);
	}

	public List<Book> listBookByAuthor(String author) 
	{
		return this.bookDao.getBookByAuthor(author);
	}

	public List<Book> listBookByBookName(String bookName) 
	{
		return this.bookDao.getBookByBookName(bookName);
	}

	public List<Book> listBookByPulisher(String publisher) 
	{
		return this.bookDao.getBookByPulisher(publisher);
	}

	public List<Book> listBookByIndexNo(String indexNo) 
	{
		return this.bookDao.getBookByIndexNo(indexNo);
	}

	public List<Book> listBookByIsbn(String isbn) 
	{
		return this.bookDao.getBookByIsbn(isbn);
	}

	public void deleteBook(int bookID) 
	{
		this.bookDao.deleteBook(bookID);
	}

	public void updateBook(Book book) 
	{
		this.bookDao.updateBook(book);
	}
}