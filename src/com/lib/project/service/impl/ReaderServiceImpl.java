package com.lib.project.service.impl;

import java.util.List;

import com.lib.project.dao.ReaderDao;
import com.lib.project.model.Reader;
import com.lib.project.service.ReaderService;

public class ReaderServiceImpl implements ReaderService {
	private ReaderDao readerDao;
	
	public ReaderDao getReaderDao() {
		return readerDao;
	}

	public void setReaderDao(ReaderDao readerDao) {
		this.readerDao = readerDao;
	}

	public List<Reader> listReader() {
		return this.readerDao.listReader();
	}

	public void addReader(Reader reader) {
		this.readerDao.insertReader(reader);
	}

	public void deleteReader(int readerID) {
		this.readerDao.deleteReader(readerID);
	}

	public void updateReader(Reader reader) {
		this.readerDao.updateReader(reader);
	}

	public Reader findReaderForLogin(String cardType, String cardNo,String password) {
		return this.readerDao.findReaderForLogin(cardType, cardNo, password);
	}

	public Reader getReaderByReaderID(int readerID) {
		return this.readerDao.getReaderByReaderID(readerID);
	}

	public Reader getReaderByBarCode(String barCode) {
		return this.readerDao.getReaderByBarCode(barCode);
	}
	
}
