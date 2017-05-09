package com.tiyworld.jsf;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
	@ManagedProperty(value="#{message}")
	private MessageBean messageBean;
	
	private String message;
	
	private String tenDangNhap="";
	private String ten="";
	private String ho="";
	
	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String addNewUser(){
		System.out.println(this.ho);
		System.out.println(this.ten);
		System.out.println(this.tenDangNhap);
		System.out.println(">>>>>> Run here");
		return "result";
	}
	
	/*public HelloWorld() {
		System.out.println("HelloWorld started!");
	}*/

	public String getMessage() {
		if(messageBean != null){
			this.message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setMessageBean(MessageBean messageBean){
		this.messageBean = messageBean;
	}
}
