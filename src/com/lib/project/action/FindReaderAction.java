package com.lib.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.lib.project.model.Reader;
import com.lib.project.service.ReaderService;
import com.opensymphony.xwork2.ActionSupport;

public class FindReaderAction extends ActionSupport {
	private ReaderService readerService;
	private String cardType;
	private String cardNo;
	private String password;
	private Reader reader;
	public ReaderService getReaderService() {
		return readerService;
	}
	public void setReaderService(ReaderService readerService) {
		this.readerService = readerService;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("================find a certain reader================");
		if(cardType.equals("")||password.equals("")||cardNo.equals(""))
		{
			return "nullReaderInfo";
		}

		reader = this.readerService.findReaderForLogin(cardType, cardNo, password);
        System.out.println("checkpoint3");
		if(reader != null)
		{
	        System.out.println("checkpoint4");
			HttpServletRequest request = ServletActionContext.getRequest(); 
			HttpServletResponse response = ServletActionContext.getResponse(); 
			HttpSession session = request.getSession();
			session.setAttribute("readerID", reader.getReaderID());
//			ActionContext context = ActionContext.getContext();   
//			context.getSession().put("readerID", reader.getReaderID()); 
			return "findReaderSuccess";
		}
		else
		{
	        System.out.println("checkpoint5");
			return "findReaderFail";	
		}
	}
}
