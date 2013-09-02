package com.lib.project.service;

import java.util.List;

import com.lib.project.model.Record;

public interface RecordService {
	public void addRecord(Record record);
	public List<Record> listRecord();
	public List<Record> listRecordByReaderID(int readerID);
	public List<Record> listRecordByCondition(int readerID,int bookID);
	public Record getRecordByID(int id);
	public void updateRecord(Record record);
}
