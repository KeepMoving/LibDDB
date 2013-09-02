package com.lib.project.service;

import java.util.List;

import com.lib.project.model.BookType;

public interface BookTypeService {
	public List<BookType> listBookType();
	public void addBookType(BookType bookType);

}
