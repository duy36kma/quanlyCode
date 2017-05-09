package com.tiyworld.jsf.action;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.tiyworld.jsf.model.Permission;
import com.tiyworld.jsf.model.User;
import com.tiyworld.jsf.modelManagement.PermissionManagement;
import com.tiyworld.jsf.modelManagement.UserManagement;

@SuppressWarnings("serial")
@ManagedBean(name="userAction", eager=true)
@RequestScoped
public class UserAction implements Serializable{
	@ManagedProperty(value="#{user}")
	private User user;
	private ArrayList<User> users;
	private ArrayList<Permission> permissions;
	private boolean isUpdate = false;
	private String loginMessage;
	
	public String login(){
		System.out.println(">>>>>> Login function -> runs");
		UserManagement um = new UserManagement();
		try{
			User u = um.login(this.user.getUserName(), this.user.getPassword());
			if(u != null) {
				return "usermanagement";
			} else {
				System.out.println("~~~~~> Login false");
				this.loginMessage = "Login false";
			}
		} catch (Exception ex){
			return null;
		}
		return "login";
	}

	public String addNewUser(){
		System.out.println(">>>>>> Add new user:");
		
		UserManagement uM = new UserManagement();
		//this.user.setPermission((new PermissionManagement()).getDefaultPermissionForUser());
		uM.insertUser(this.user);
		return "usermanagement";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<User> getUsers() {
		UserManagement userManagement = new UserManagement();
		users = new ArrayList<User>();
		users.addAll(userManagement.getAll());
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public String getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}

	public ArrayList<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(ArrayList<Permission> permissions) {
		this.permissions = permissions;
	}
}
