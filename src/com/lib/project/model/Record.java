package com.lib.project.model;

import java.sql.Timestamp;

public class Record {
	private int id;
	private int readerID;
	private int bookID;
	private Timestamp borrowTime;
	private Timestamp ask_backTime;
	private int operator;
	private String isBack;
	private Timestamp real_backTime;
	private String location;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public Timestamp getReal_backTime() {
		return real_backTime;
	}
	public void setReal_backTime(Timestamp real_backTime) {
		this.real_backTime = real_backTime;
	}
}
