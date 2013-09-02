package com.lib.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.lib.project.model.Reader;
import com.lib.project.service.ReaderService;
import com.opensymphony.xwork2.ActionSupport;

public class DisplayReaderInfoAction extends ActionSupport {
	private ReaderService readerService;
	private int readerID;
	public ReaderService getReaderService() {
		return readerService;
	}
	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
	}
	public int getReaderID() {
		return readerID;
	}
	public void setReaderID(int readerID) {
		this.readerID = readerID;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================display a certain reader================");
		System.out.println("readerID = " + readerID);
		Reader readerObj = this.readerService.getReaderByReaderID(readerID);
		if(readerObj != null)
		{
	        System.out.println("displayReaderInfoCheckpoint4");
			HttpServletRequest request = ServletActionContext.getRequest(); 
			HttpServletResponse response = ServletActionContext.getResponse(); 
			HttpSession session = request.getSession();
			session.setAttribute("readerObj", readerObj);
//			ActionContext context = ActionContext.getContext();   
//			context.getSession().put("readerID", reader.getReaderID()); 
			return "displayReaderInfoSuccess";
		}
		else
		{
	        System.out.println("displayReaderInfoCheckpoint5");
			return "displayReaderInfoFail";	
		}
	}
	

}
