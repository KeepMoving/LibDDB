package com.lib.project.service.impl;

import java.util.List;

import com.lib.project.dao.RecordDao;
import com.lib.project.model.Record;
import com.lib.project.service.RecordService;

public class RecordServiceImpl implements RecordService 
{
	private RecordDao recordDao;
	
	public RecordDao getRecordDao() {
		return recordDao;
	}

	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}

	public void addRecord(Record record) 
	{
		this.recordDao.insertRecord(record);
	}

	public List<Record> listRecord() 
	{
		return this.recordDao.listRecord();
	}

	public List<Record> listRecordByReaderID(int readerID) 
	{
		return this.recordDao.listRecordByReaderID(readerID);
	}

	public List<Record> listRecordByCondition(int readerID, int bookID) 
	{
		return this.recordDao.listRecordByCondition(readerID, bookID);
	}

	public Record getRecordByID(int id) 
	{
		return this.recordDao.getRecordByID(id);
	}

	public void updateRecord(Record record) 
	{
		this.recordDao.updateRecord(record);
	}
}
