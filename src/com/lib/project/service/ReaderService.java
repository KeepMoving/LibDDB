package com.lib.project.service;

import java.util.List;

import com.lib.project.model.Reader;

public interface ReaderService {
	public List<Reader> listReader();
	public void addReader(Reader reader);
	public void deleteReader(int readerID);
	public void updateReader(Reader reader);
	public Reader findReaderForLogin(String cardType, String cardNo,String password);
	public Reader getReaderByReaderID(int readerID);
	public Reader getReaderByBarCode(String barCode);
}
