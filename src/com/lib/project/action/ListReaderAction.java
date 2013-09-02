package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Reader;
import com.lib.project.service.ReaderService;
import com.opensymphony.xwork2.ActionSupport;

public class ListReaderAction extends ActionSupport {
	private ReaderService readerService;
	private List<Reader> rList;
	public ReaderService getReaderService() {
		return readerService;
	}

	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
	}

	public List<Reader> getRList() {
		return rList;
	}

	public void setRList(List<Reader> list) {
		rList = list;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("================Find All Readers================");
		rList = this.readerService.listReader();
		System.out.print("共找到符合条件的记录数： " + rList.size());
		return "listReaderSuccess";
	}
}
