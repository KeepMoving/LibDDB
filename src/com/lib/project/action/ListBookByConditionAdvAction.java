package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Book;
import com.lib.project.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListBookByConditionAdvAction extends ActionSupport {
	private BookService bookService;
	private List<Book> bList;
	private String bookInfoAdv;
	private int indexTypeAdv;
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public String getBookInfoAdv() {
		return bookInfoAdv;
	}
	public void setBookInfoAdv(String bookInfoAdv) {
		this.bookInfoAdv = bookInfoAdv;
	}
	public int getIndexTypeAdv() {
		return indexTypeAdv;
	}
	public void setIndexTypeAdv(int indexTypeAdv) {
		this.indexTypeAdv = indexTypeAdv;
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
		switch(indexTypeAdv)
		{
			case 1:	System.out.println("find books by bookName");
					bList = this.bookService.listBookByBookName(bookInfoAdv);
					break;
			case 2:	System.out.println("find books by author");
					bList = this.bookService.listBookByAuthor(bookInfoAdv);
				    break;
			case 3:	System.out.println("find books by publisher");
					bList = this.bookService.listBookByPulisher(bookInfoAdv);
				  	break;
			case 4:	System.out.println("find books by indexNo");
					bList = this.bookService.listBookByPulisher(bookInfoAdv);
					break;
			case 5:	System.out.println("find books by Isbn");
					bList = this.bookService.listBookByPulisher(bookInfoAdv);
					break;
			default:System.out.println("indexType error");
					System.out.println("indexType = " + indexTypeAdv);
					break;
		}
		return "listBookByConditionAdvSuccess";
	}

}
