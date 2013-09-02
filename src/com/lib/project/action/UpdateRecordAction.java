package com.lib.project.action;

import java.sql.Timestamp;

import com.lib.project.model.Record;
import com.lib.project.service.RecordService;
import com.lib.project.util.TimeGenerator;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateRecordAction extends ActionSupport {
	private RecordService recordService;
	private int id;
	private int readerID;
	private int bookID;
	private Timestamp borrowTime;
	private Timestamp ask_backTime;
	private int operator;
	private String isBack;
	private Timestamp real_backTime;
	private String location;
	public RecordService getRecordService() {
		return recordService;
	}
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Timestamp getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(Timestamp borrowTime) {
		this.borrowTime = borrowTime;
	}
	public Timestamp getAsk_backTime() {
		return ask_backTime;
	}
	public void setAsk_backTime(Timestamp ask_backTime) {
		this.ask_backTime = ask_backTime;
	}
	public int getOperator() {
		return operator;
	}
	public void setOperator(int operator) {
		this.operator = operator;
	}
	public String getIsBack() {
		return isBack;
	}
	public void setIsBack(String isBack) {
		this.isBack = isBack;
	}
	public Timestamp getReal_backTime() {
		return real_backTime;
	}
	public void setReal_backTime(Timestamp real_backTime) {
		this.real_backTime = real_backTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Update a certain record================");
		TimeGenerator getTime = new TimeGenerator();
		TimeGenerator parseTime = new TimeGenerator();		
		real_backTime = parseTime.parseTimestamp(getTime.getCurrentTime());
		isBack = "是";
		
		Record record = new Record();
		record.setAsk_backTime(ask_backTime);
		record.setBookID(bookID);
		record.setBorrowTime(borrowTime);
		record.setId(id);
		record.setIsBack(isBack);
		record.setLocation(location);
		record.setOperator(operator);
		record.setReaderID(readerID);
		record.setReal_backTime(real_backTime);
		
		this.recordService.updateRecord(record);
		return "updateRecordSuccess";
	}
}
