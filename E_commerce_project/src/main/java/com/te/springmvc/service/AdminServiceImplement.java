package com.te.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springmvc.bean.AdminBean;
import com.te.springmvc.dao.AdminDao;
@Service
public class AdminServiceImplement implements AdminService{
	@Autowired
	AdminDao admindao;
	@Override
	public AdminBean authenticate(Integer userid, String password) {
		return admindao.authenticate(userid, password);
	}

}
