package com.lib.project.dao;

import java.util.List;

import com.lib.project.model.Reader;

public interface ReaderDao {
	public List<Reader> listReader();
	public void insertReader(Reader reader);
	public void deleteReader(int readerID);
	public void updateReader(Reader reader);
	public Reader findReaderForLogin(String cardType,String cardNo,String password);
	public Reader getReaderByReaderID(int readerID);
	public Reader getReaderByBarCode(String barCode);
}
