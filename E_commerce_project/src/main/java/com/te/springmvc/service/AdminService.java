package com.te.springmvc.service;

import com.te.springmvc.bean.AdminBean;

public interface AdminService {
	public AdminBean authenticate(Integer userid ,String password);
}
