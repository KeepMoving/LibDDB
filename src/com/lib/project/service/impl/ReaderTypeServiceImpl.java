package com.lib.project.service.impl;

import java.util.List;

import com.lib.project.dao.ReaderTypeDao;
import com.lib.project.model.ReaderType;
import com.lib.project.service.ReaderTypeService;

public class ReaderTypeServiceImpl implements ReaderTypeService {

	private ReaderTypeDao readerTypeDao;
	
	public ReaderTypeDao getReaderTypeDao() {
		return readerTypeDao;
	}

	public void setReaderTypeDao(ReaderTypeDao readerTypeDao) {
		this.readerTypeDao = readerTypeDao;
	}

	public List<ReaderType> listReaderType() {
		return this.readerTypeDao.listReaderType();
	}

}
