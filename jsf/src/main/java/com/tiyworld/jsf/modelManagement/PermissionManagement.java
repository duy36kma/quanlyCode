package com.tiyworld.jsf.modelManagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tiyworld.jsf.hibernate.HibernateUtil;
import com.tiyworld.jsf.model.Permission;
import com.tiyworld.jsf.model.User;

public class PermissionManagement {
	Session session ;
	
	public List<Permission> getAll(){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();
		List<Permission> listPermission = new ArrayList<Permission>();
		listPermission.addAll(session.createQuery("FROM Permission").list());
		tx.commit();
		return listPermission;
	}
	
	public Permission getDefaultPermissionForUser(){
		Permission permission = new Permission();
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();
		String sql = "SELECT count(*) FROM Permission WHERE permissionName = :perName";
		Query query = session.createQuery(sql);
		query.setParameter("perName", "Member");
		tx.commit();
		return permission;
	}

	public static void main( String[] args ) {
		//insertUser();
		System.out.println(">>>>>> get all user");
		PermissionManagement app = new PermissionManagement();
		for(Permission permission : app.getAll()){
			System.out.println("permission: " + permission.getId() + "\t" + permission.getPermissionName());
			for(User u : permission.getUsers()){
				System.out.println("--\t"+u.getUserName());
			}
			System.out.println("---------------------------------------");
		}
	}
}
