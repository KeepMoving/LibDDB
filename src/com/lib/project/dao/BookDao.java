package com.lib.project.dao;

import java.util.List;

import com.lib.project.model.Book;

public interface BookDao {
	public List<Book> listBook();
	public void insertBook(Book book);
	public Book getBookByBookID(int bookID);
	public Book getBookByBarcode(String barcode);
	public List<Book> getBookByBookName(String bookName);
	public List<Book> getBookByAuthor(String author);
	public List<Book> getBookByPulisher(String publisher);
	public List<Book> getBookByIsbn(String isbn);
	public List<Book> getBookByIndexNo(String indexNo);
	public void deleteBook(int bookID);
	public void updateBook(Book book);
}
