package com.lib.project.model;

public class ReaderType {
	private int id;
	private String jbType;
	private int timeLimit;
	private int quantityLimit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJbType() {
		return jbType;
	}
	public void setJbType(String jbType) {
		this.jbType = jbType;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getQuantityLimit() {
		return quantityLimit;
	}
	public void setQuantityLimit(int quantityLimit) {
		this.quantityLimit = quantityLimit;
	}
}
