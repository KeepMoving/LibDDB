package com.lib.project.action;

import java.util.List;

import com.lib.project.model.ReaderType;
import com.lib.project.service.ReaderTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class ListReaderTypeAction extends ActionSupport {
	private ReaderTypeService readerTypeService;
	private List<ReaderType> rtList;

	public ReaderTypeService getReaderTypeService() {
		return readerTypeService;
	}

	public void setReaderTypeService(ReaderTypeService readerTypeService) {
		this.readerTypeService = readerTypeService;
	}
	
	public List<ReaderType> getRtList() {
		return rtList;
	}

	public void setRtList(List<ReaderType> rtList) {
		this.rtList = rtList;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("================List all ReaderTypes================");
		rtList = this.readerTypeService.listReaderType();
		System.out.println("得到数据条目：" + rtList.size());
		return "listReaderTypeSuccess";
	}
}	
