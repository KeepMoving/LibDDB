package com.lib.project.model;

import java.sql.Timestamp;

public class Reader {
	private java.lang.Integer readerID;
	private java.lang.Integer typeID;
	private String cardType;
	private String cardNo;
	private java.lang.Integer operator;
	private Timestamp createDate;
	private String barCode;
	private String readerName;
	private String sex;
	private String tel;
	private String email;
	private String password;
	
	public java.lang.Integer getReaderID() {
		return readerID;
	}
	public void setReaderID(java.lang.Integer readerID) {
		this.readerID = readerID;
	}
	public java.lang.Integer getTypeID() {
		return typeID;
	}
	public void setTypeID(java.lang.Integer typeID) {
		this.typeID = typeID;
	}
	public java.lang.Integer getOperator() {
		return operator;
	}
	public void setOperator(java.lang.Integer operator) {
		this.operator = operator;
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
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
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
}
