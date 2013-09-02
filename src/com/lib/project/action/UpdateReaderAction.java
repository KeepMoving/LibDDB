package com.lib.project.action;

import java.util.Date;

import com.lib.project.model.Reader;
import com.lib.project.service.ReaderService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateReaderAction extends ActionSupport {
	private ReaderService readerService;
	private int readerID;
	private int typeID;
	private String cardType;
	private String cardNo;
	private int operator;
	private Date createDate;
	private String barCode;
	private String readerName;
	private String sex;
	private String tel;
	private String email;
	private String password;
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
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getOperator() {
		return operator;
	}
	public void setOperator(int operator) {
		this.operator = operator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================Update a certain reader================");
		Reader reader = new Reader();
		reader.setBarCode(barCode);
		reader.setCardNo(cardNo);
		reader.setCardType(cardType);
//		reader.setCreateDate(createDate);
		reader.setEmail(email);
		reader.setOperator(operator);
		reader.setPassword(password);
		reader.setReaderID(readerID);
		reader.setReaderName(readerName);
		reader.setSex(sex);
		reader.setTel(tel);
		reader.setTypeID(typeID);
		
		this.readerService.updateReader(reader);
		return "updateReaderSuccess";
	}
}
