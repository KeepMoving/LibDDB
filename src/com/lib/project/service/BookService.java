package com.lib.project.service;

import java.util.List;

import com.lib.project.model.Book;

public interface BookService {
    public List<Book> listBook();
    public void addBook(Book book);
	public Book getBookByBookID(int bookID);
	public Book getBookByBarcode(String barcode);
	public List<Book> listBookByBookName(String bookName);
	public List<Book> listBookByAuthor(String author);
	public List<Book> listBookByPulisher(String publisher);	
	public List<Book> listBookByIsbn(String isbn);
	public List<Book> listBookByIndexNo(String indexNo);
	public void deleteBook(int bookID);
	public void updateBook(Book book);
}
