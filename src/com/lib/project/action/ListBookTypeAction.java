package com.lib.project.action;

import java.util.List;

import com.lib.project.model.BookType;
import com.lib.project.service.BookTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class ListBookTypeAction extends ActionSupport {
	private BookTypeService bookTypeService;
	private List<BookType> btList;
	
	public BookTypeService getBookTypeService() {
		return bookTypeService;
	}
	
	public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}

	public List<BookType> getBtList() {
		return btList;
	}
	
	public void setBtList(List<BookType> btList) {
		this.btList = btList;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Find all BookType================");
		btList = bookTypeService.listBookType();
		System.out.println("得到数据条目：" + btList.size());
		return "listBookTypeSuccess";
	}
	

}
