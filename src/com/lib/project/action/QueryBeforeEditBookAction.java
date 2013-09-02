package com.lib.project.action;

import com.lib.project.model.Book;
import com.lib.project.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class QueryBeforeEditBookAction extends ActionSupport {
	private BookService bookService;
	private int bookID;
	private Book bookObj;
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
	public Book getBookObj() {
		return bookObj;
	}
	public void setBookObj(Book bookObj) {
		this.bookObj = bookObj;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Get a certain book================");
		bookObj = this.bookService.getBookByBookID(bookID);
		if(bookObj != null)
		{
			ActionContext context = ActionContext.getContext();   
			context.getSession().put("bookObj", bookObj); 
			return "queryBeforeEditBookSuccess";
		}else{
			return "queryBeforeEditBookFail";
		}
	}
}
