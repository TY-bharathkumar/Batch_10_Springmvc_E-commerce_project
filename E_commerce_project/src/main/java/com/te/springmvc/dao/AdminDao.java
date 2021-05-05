package com.te.springmvc.dao;

import com.te.springmvc.bean.AdminBean;

public interface AdminDao {
	public AdminBean authenticate(Integer userid ,String password);
}
