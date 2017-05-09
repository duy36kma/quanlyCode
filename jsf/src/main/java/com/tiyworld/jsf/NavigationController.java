package com.tiyworld.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable{
	@ManagedProperty(value="#{param.pageId}")
	private String pageId;
	
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String moveToPage1(){
		return "page1";
	}
	
	public String showPage(){
		if(this.pageId == null) return "home";
		if(this.pageId.equals("1")) return "page1";
		else if(this.pageId.equals("2")) return "page2";
		return "home";
	}
	
	/**
	 * Navigation based on form-action
	 */
	public String processPage1(){
		return "page";
	}
	
	public String processPage2(){
		return "page";
	}
}
