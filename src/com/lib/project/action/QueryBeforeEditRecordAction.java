package com.lib.project.action;

import com.lib.project.model.Record;
import com.lib.project.service.RecordService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class QueryBeforeEditRecordAction extends ActionSupport {
	private RecordService recordService;
	private int id;
	private Record recordObj;
	public RecordService getRecordService() {
		return recordService;
	}
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Record getRecordObj() {
		return recordObj;
	}
	public void setRecordObj(Record recordObj) {
		this.recordObj = recordObj;
	}
	@Override
	public String execute() throws Exception 
	{
		System.out.println("================Get a certain record================");
		recordObj = this.recordService.getRecordByID(id);
		if(recordObj != null)
		{
			ActionContext context = ActionContext.getContext();   
			context.getSession().put("recordObj", recordObj); 
			return "queryBeforeEditRecordSuccess";
		}else{
			return "queryBeforeEditRecordFail";
		}
	}
}
