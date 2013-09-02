package com.lib.project.action;

import java.util.List;

import com.lib.project.model.Record;
import com.lib.project.service.RecordService;
import com.opensymphony.xwork2.ActionSupport;

public class ListRecordByReaderIDAction extends ActionSupport {
	private RecordService recordService;
	private List<Record> rList;
	private int readerID;
	
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

	@Override
	public String execute() throws Exception 
	{
		System.out.println("================List all records by readerID================");
		rList = this.recordService.listRecordByReaderID(readerID);
		return "listRecordByReaderIDSuccess";
	}
	

}
