package com.lib.project.dao;

import java.util.List;

import com.lib.project.model.Record;

public interface RecordDao {
	public void insertRecord(Record record);
	public List<Record> listRecord();
	public void updateRecord(Record record);
	public List<Record> listRecordByReaderID(int readerID);
	public List<Record> listRecordByCondition(int readerID,int bookID);
	public Record getRecordByID(int id);
}
