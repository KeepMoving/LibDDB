package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Record;
import com.lib.project.service.RecordService;
import com.opensymphony.xwork2.ActionSupport;

public class ListRecordByConditionAdvAction extends ActionSupport {
	private RecordService recordService;
	private List<Record> rList;
	private int readerID;
	private int bookID;

	public RecordService getRecordService() {
		return recordService;
	}

	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}

	public List<Record> getRList() {
		return rList;
	}

	public void setRList(List<Record> list) {
		rList = list;
	}

	public int getReaderID() {
		return readerID;
	}

	public void setReaderID(int readerID) {
		this.readerID = readerID;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("================Find Records by condition================");
		rList = this.recordService.listRecordByCondition(readerID, bookID);
		return "listRecordByConditionAdvSuccess";
	}

}
