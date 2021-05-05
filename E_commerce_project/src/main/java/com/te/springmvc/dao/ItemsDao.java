package com.te.springmvc.dao;

import java.util.List;

import com.te.springmvc.bean.ItemsBean;

public interface ItemsDao {
	public boolean additems(ItemsBean itembean);
	public boolean removeItem(Integer userid);
	public boolean updateItem(ItemsBean itembean);
	public List<ItemsBean> getItemList();
}
