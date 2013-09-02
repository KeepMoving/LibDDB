package com.lib.project.service.impl;

import java.util.List;

import com.lib.project.dao.BookTypeDao;
import com.lib.project.model.BookType;
import com.lib.project.service.BookTypeService;

public class BookTypeServiceImpl implements BookTypeService {

	private BookTypeDao bookTypeDao;
	
	public BookTypeDao getBookTypeDao() {
		return bookTypeDao;
	}

	public void setBookTypeDao(BookTypeDao bookTypeDao) {
		this.bookTypeDao = bookTypeDao;
	}

	public List<BookType> listBookType() {
		return bookTypeDao.listBookType();
	}

	public void addBookType(BookType bookType) {
		this.bookTypeDao.insertBookType(bookType);
	}
}
