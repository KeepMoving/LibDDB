package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Book;
import com.lib.project.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

public class ListBookAction extends ActionSupport {
	private List<Book> bList;
	private BookService bookService;
	
	public List<Book> getBList() {
		return bList;
	}

	public void setBList(List<Book> list) {
		bList = list;
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("================FindAllBook================");
		bList = bookService.listBook();
		System.out.print(bList.size());
		return "listBookSuccess";
	}
}
