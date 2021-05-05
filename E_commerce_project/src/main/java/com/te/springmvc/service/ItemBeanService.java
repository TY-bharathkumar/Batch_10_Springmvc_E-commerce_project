package com.te.springmvc.service;

import java.util.List;

import com.te.springmvc.bean.ItemsBean;

public interface ItemBeanService {
	public boolean additems(ItemsBean itembean);
	public boolean removeItem(Integer userid);
	public boolean updateItem(ItemsBean itembean);
	public List<ItemsBean> getItemList();
}
