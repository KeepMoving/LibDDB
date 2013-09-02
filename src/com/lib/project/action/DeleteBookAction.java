package com.lib.project.action;

import com.lib.project.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteBookAction extends ActionSupport {
	private BookService bookService;
	private int bookID;
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Delete a certain book================");
		this.bookService.deleteBook(bookID);
		return "deleteBookSuccess";
	}
}
