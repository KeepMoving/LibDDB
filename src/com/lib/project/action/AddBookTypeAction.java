package com.lib.project.action;

import com.lib.project.model.BookType;
import com.lib.project.service.BookTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class AddBookTypeAction extends ActionSupport {
	private BookTypeService bookTypeService;
	private int id;
	private String bookType;
	
	public BookTypeService getBookTypeService() {
		return bookTypeService;
	}
	
	public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBookType() {
		return bookType;
	}
	
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("================Add a new bookType================");
		System.out.println("id = " + id);
		System.out.println("bookType = " + bookType);
		BookType bookTypeInstance = new BookType();
		bookTypeInstance.setId(id);
		bookTypeInstance.setBookType(bookType);
		bookTypeService.addBookType(bookTypeInstance);
		
		return "addBookTypeSuccess";
	}
	
}
