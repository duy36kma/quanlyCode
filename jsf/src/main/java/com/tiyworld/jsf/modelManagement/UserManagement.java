package com.tiyworld.jsf.modelManagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.tiyworld.jsf.hibernate.HibernateUtil;
import com.tiyworld.jsf.model.User;

/**
 * Hello world!
 *
 */
public class UserManagement 
{
	Session session ;

	public void testConnection(){
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("finish test connect DB");
		session.close();
	}

	public void insertUser(User user){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<User> getAll(){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();
		List<User> listUsers = new ArrayList<User>();
		listUsers.addAll(session.createQuery("FROM User").list());
		tx.commit();
		return listUsers;
	}

	public User getUserByID(int id){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();
		//User user = session.load(User.class, id);

		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		User user = (User)criteria.list().get(0);
		tx.commit();
		return user;
	}

	public List<User> getUserByAddress(String address){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();

		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.like("address", "%"+address+"%"));
		criteria.addOrder(Order.asc("userName"));
		//List userList = criteria.list();
		tx.commit();
		return criteria.list();
	}

	public long countUserByAddress(String address){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();

		String sql = "SELECT count(*) FROM User WHERE address LIKE :address";
		Query query = session.createQuery(sql);
		query.setParameter("address", "%"+address + "%");
		List resultList = query.list();
		tx.commit();
		return (Long)resultList.get(0);
	}

	/**
	 * Login system
	 * @param userName	user-name of account
	 * @param pass		Pass word
	 * @return			User object
	 */
	public User login(String userName, String pass){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();

		String sql = "FROM User u "
				+ "WHERE userName = :userName and password=MD5(:password)";
		Query query = session.createQuery(sql);
		query.setParameter("userName", userName).setParameter("password", pass);

		tx.commit();
		if(query.list().size() > 0)
			return (User)query.list().get(0);
		else 
			return null;
	}

	/**
	 * Get all users, using Native SQL
	 * @return List<User>
	 */
	public List<User> getAllUserWithNativeSQL(){
		session = HibernateUtil.SESSION_FACTORY.openSession();
		Transaction tx = session.beginTransaction();

		String sql = "SELECT * FROM users";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(User.class);
		List<User> list = query.list();
		tx.commit();
		return list;
	}

	public static void deleteObject(){

	}

	public static void main( String[] args )
	{
		UserManagement app = new UserManagement();
		/*//insertUser();
		System.out.println(">>>>>> get all user");
		for(User user : app.getAll()){
			System.out.println(user.getId() + "\t" + user.getUserName() + "\t" + user.getPermission().getPermissionName());
		}

		System.out.println(">>>>>> find user");
		User u = app.getUserByID(2);
		System.out.println(u.getId() + "\t" + u.getUserName());

		System.out.println(">>>>>> find user by address");
		for(User object : app.getUserByAddress("Cau Giay")){
			System.out.println(object.getUserName());
		}

		System.out.println(">>>>> Count user by address: Cau Giay");
		System.out.println(app.countUserByAddress("Cau Giay") + " users has address at Cau Giay");
		
		System.out.println(">>>>>> Login:");
		System.out.println(app.login("root", "123456").getUserName());
		
		System.out.println(">>>>>> Get all user with Native SQL");
		for(User obj : app.getAllUserWithNativeSQL()){
			System.out.println(obj.getUserName());
		}
		 */
		System.out.println(">>>>>> get all user");
		for(User user : app.getAll()){
			System.out.println(user.getId() + "\t" + user.getUserName() + "\t" + user.getPermission().getPermissionName());
		}
		
		System.out.println(">>>>>> Login:");
		System.out.println(app.login("root", "duy7195").getUserName());
		System.out.println(">>>>>> Finish");
	}
}
