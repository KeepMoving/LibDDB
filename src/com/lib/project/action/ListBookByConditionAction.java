package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Book;
import com.lib.project.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

public class ListBookByConditionAction extends ActionSupport {
	private BookService bookService;
	private List<Book> bList;
	private String bookInfo;
	private int indexType;
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public String getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
	public int getIndexType() {
		return indexType;
	}
	public void setIndexType(int indexType) {
		this.indexType = indexType;
	}
	public List<Book> getBList() {
		return bList;
	}
	public void setBList(List<Book> list) {
		bList = list;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Find Books by condition================");
		switch(indexType)
		{
			case 1:	System.out.println("find books by bookName");
					bList = this.bookService.listBookByBookName(bookInfo);
					break;
			case 2:	System.out.println("find books by author");
					bList = this.bookService.listBookByAuthor(bookInfo);
				    break;
			case 3:	System.out.println("find books by publisher");
					bList = this.bookService.listBookByPulisher(bookInfo);
				  	break;
			default:System.out.println("indexType error");
					System.out.println("indexType = " + indexType);
					break;
		}
		return "listBookByConditionSuccess";
	}

}
