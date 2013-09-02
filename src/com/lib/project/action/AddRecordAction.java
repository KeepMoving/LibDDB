package com.lib.project.action;

import java.sql.Timestamp;

import com.lib.project.model.Reader;
import com.lib.project.model.Record;
import com.lib.project.service.ReaderService;
import com.lib.project.service.RecordService;
import com.lib.project.util.TimeGenerator;
import com.opensymphony.xwork2.ActionSupport;

public class AddRecordAction extends ActionSupport {
	private RecordService recordService;
	private ReaderService readerService;
	private int id;
	private int readerID;
	private int bookID;
	private Timestamp borrowTime;
	private Timestamp ask_backTime;
	private int operator;
	private String isBack;
	private Timestamp real_backTime;
	private String location;
	private int locationNum;
	public RecordService getRecordService() {
		return recordService;
	}

	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}

	public ReaderService getReaderService() {
		return readerService;
	}

	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
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
	
	public int getLocationNum() {
		return locationNum;
	}

	public void setLocationNum(int locationNum) {
		this.locationNum = locationNum;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("================Add a new record================");
		int borrowPeriod = 2;
		
		Reader reader = this.readerService.getReaderByReaderID(readerID);
		int readerType = reader.getTypeID();
		System.out.println("readerType = " + readerType);
		if(readerType == 1)
			borrowPeriod = 1;
		
		TimeGenerator getTime = new TimeGenerator();
		TimeGenerator parseTime = new TimeGenerator();	
		borrowTime = parseTime.parseTimestamp(getTime.getCurrentTime());
		String dateStr = String.valueOf(borrowTime);
		
		String year = dateStr.substring(0,4);
		String month = dateStr.substring(5,7);
		String day = dateStr.substring(8,10);
		String time = dateStr.substring(11,19);
		
		int backyear = 1;
		int backmonth = 1;	
		if(Integer.parseInt(month) + borrowPeriod >12)
		{
			backyear = Integer.parseInt(year) + 1;
			backmonth = Integer.parseInt(month) + borrowPeriod -12;
		}
		else
			backyear = Integer.parseInt(year);
		
		ask_backTime = parseTime.parseTimestamp(backyear + "-" + backmonth + "-" + day + " " + time);
		
		isBack = "否";
		real_backTime = null;
		
		if(locationNum == 1)
			location = "新区图书馆";
		else
			location = "老区图书馆";
		
		System.out.println("location = " + location);
		
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
		
		this.recordService.addRecord(record);
		
		return "addRecordSuccess";
	}

}
