package com.te.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvc.bean.ItemsBean;
@Repository
public class ItemsBeanDaoImplement implements ItemsDao{

	@Override
	public boolean additems(ItemsBean itembean) {
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(itembean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removeItem(Integer userid) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			ItemsBean itemBean = manager.find(ItemsBean.class, userid);
			manager.remove(itemBean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateItem(ItemsBean itembean) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			ItemsBean orgData = manager.find(ItemsBean.class, itembean.getUserid());
			if(itembean.getPrice()!=0){
				orgData.setPrice(itembean.getPrice());
			}
			if(itembean.getQuantity()!=0){
				orgData.setQuantity(itembean.getQuantity());
			}
			if(itembean.getReview()!=0){
				orgData.setReview(itembean.getReview());
			}
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ItemsBean> getItemList() {
		List<ItemsBean> itembean=null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();

			Query query = manager.createQuery("from EmployeeInfoBean");

			itembean = query.getResultList();


		} catch (Exception e) {
			itembean = null;
			e.printStackTrace();
		}

		return itembean;
	}
}


