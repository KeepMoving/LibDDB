package com.lib.project.dao;

import java.util.List;

import com.lib.project.model.BookType;

public interface BookTypeDao {
	public List<BookType> listBookType();
	public void insertBookType(BookType bookType);
}
