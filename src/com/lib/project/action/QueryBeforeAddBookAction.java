package com.lib.project.action;

import java.util.List;

import com.lib.project.model.BookType;
import com.lib.project.model.Manager;
import com.lib.project.service.BookTypeService;
import com.lib.project.service.ManagerService;
import com.opensymphony.xwork2.ActionSupport;

public class QueryBeforeAddBookAction extends ActionSupport {
	private BookTypeService bookTypeService;
	private List<BookType> btList;
	private int operatorID;
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
	public int getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(int operatorID) {
		this.operatorID = operatorID;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Query bookType and ManagerID================");
		btList = this.bookTypeService.listBookType();
		System.out.println("operatorID = " + operatorID);
		return "queryBeforeAddBookSuccess";
	}
}
