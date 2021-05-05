package com.te.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springmvc.bean.ItemsBean;
import com.te.springmvc.dao.ItemsDao;
@Service
public class ItemBeanServiceImplementation implements ItemBeanService{

	@Autowired
	ItemsDao itemdao;
	@Override
	public boolean additems(ItemsBean itembean) {

		return itemdao.additems(itembean);
	}

	@Override
	public boolean removeItem(Integer userid) {
		// TODO Auto-generated method stub
		return itemdao.removeItem(userid);
	}

	@Override
	public boolean updateItem(ItemsBean itembean) {
		// TODO Auto-generated method stub
		return itemdao.updateItem(itembean);
	}

	@Override
	public List<ItemsBean> getItemList() {
		// TODO Auto-generated method stub
		return itemdao.getItemList();
	}

}
