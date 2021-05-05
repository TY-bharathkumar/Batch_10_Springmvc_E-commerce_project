package com.te.springmvc.dao;

import java.util.Queue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.springmvc.bean.AdminBean;

public class AdminDaoImplementation implements AdminDao {

	@Override
	public AdminBean authenticate(Integer userid, String password) {
		AdminBean adminbean=null;	
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();

			String getData = "from admin where empId=:id and password=:pwd";

			Query query = manager.createQuery(getData);
			query.setParameter("id", userid);
			query.setParameter("pwd", password);
			adminbean = (AdminBean) query.getSingleResult();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return adminbean;
	}

}
