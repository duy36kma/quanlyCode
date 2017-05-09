package com.tiyworld.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="message", eager=true)
@RequestScoped
public class MessageBean {
	private String message = "Hello JSF";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
