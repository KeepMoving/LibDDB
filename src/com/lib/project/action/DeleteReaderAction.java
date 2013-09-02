package com.lib.project.action;

import com.lib.project.service.ReaderService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteReaderAction extends ActionSupport {
	private ReaderService readerService;
	private int readerID;
	public ReaderService getReaderService() {
		return readerService;
	}
	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
	}
	public int getReaderID() {
		return readerID;
	}
	public void setReaderID(int readerID) {
		this.readerID = readerID;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Delete a certain reader================");
		this.readerService.deleteReader(readerID);
		return "deleteReaderSuccess";
	}
}
