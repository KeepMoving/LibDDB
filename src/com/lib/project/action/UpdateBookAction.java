package com.lib.project.action;

import java.sql.Timestamp;

import com.lib.project.model.Book;
import com.lib.project.service.BookService;
import com.lib.project.util.TimeGenerator;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateBookAction extends ActionSupport {
	private BookService bookService;
	private int bookID;
	private String barCode;
	private String isbn;
	private String bookName;
	private java.lang.Integer typeId;
	private String author;
	private String translator;
	private String publisher;
	private String indexNo;
	private Timestamp addTime;
	private java.lang.Double price;
	private java.lang.Integer operator;
	private String status;
	private String location;
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public java.lang.Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(java.lang.Integer typeId) {
		this.typeId = typeId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIndexNo() {
		return indexNo;
	}
	public void setIndexNo(String indexNo) {
		this.indexNo = indexNo;
	}
	public Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}
	public java.lang.Double getPrice() {
		return price;
	}
	public void setPrice(java.lang.Double price) {
		this.price = price;
	}
	public java.lang.Integer getOperator() {
		return operator;
	}
	public void setOperator(java.lang.Integer operator) {
		this.operator = operator;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================update a certain book================");
		TimeGenerator getTime = new TimeGenerator();
		TimeGenerator parseTime = new TimeGenerator();		
		addTime = parseTime.parseTimestamp(getTime.getCurrentTime());
		
		Book bookTemp = new Book();
		
		bookTemp.setBookID(bookID);
		bookTemp.setBookName(bookName);
		bookTemp.setAddTime(addTime);
		bookTemp.setAuthor(author);
		bookTemp.setBarCode(barCode);
		bookTemp.setIndexNo(indexNo);
		bookTemp.setIsbn(isbn);
		bookTemp.setLocation(location);
		bookTemp.setOperator(operator);
		bookTemp.setPrice(price);
		bookTemp.setPublisher(publisher);
		bookTemp.setStatus(status);
		bookTemp.setTranslator(translator);
		bookTemp.setTypeId(typeId);
		this.bookService.updateBook(bookTemp);
		return "updateBookSuccess";
	}

}
