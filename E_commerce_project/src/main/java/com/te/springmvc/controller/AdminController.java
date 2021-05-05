package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.te.springmvc.bean.AdminBean;
import com.te.springmvc.service.AdminService;

@Controller
public class AdminController {
	
@Autowired
private AdminService service;
	@GetMapping("/AdminLogin")
	public String loginpage(){
		return "AdminLogin";
	}
	public String authenticate(Integer userid,String password,ModelMap map,HttpServletRequest request){
		AdminBean bean=service.authenticate(userid, password);
		if(bean!=null){
			System.out.println("Login Successful");
			HttpSession session=request.getSession(true);
			session.setAttribute("loggedInfo", bean);
			return "AdminLogin";
		}
		else{
			System.out.println(" login failure");
			map.addAttribute("msg", " User Details Not Found");
			return "Header";
		}
		
	}
}
