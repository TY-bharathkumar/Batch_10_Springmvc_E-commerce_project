package com.te.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springmvc.bean.ItemsBean;
import com.te.springmvc.service.ItemBeanService;

@Controller
public class ItemBeanContrller {
	@Autowired
	private ItemBeanService service;

	@GetMapping("/search")
	public String getSearchPage(HttpSession session, ModelMap map) {

		if (session.getAttribute("loggedInfo") != null) {
			return "searchPage";
		} else {
			map.addAttribute("msg", " Please Login First ");
			return "AdminLogin";
		}

	}

	@GetMapping("/searchitem")
	public String getEmployeeData(Integer id, ModelMap map,
			@SessionAttribute(name = "loggedInfo", required = false) ItemsBean infoBean) {
		if (infoBean != null) {
			ItemsBean itembean = (ItemsBean) service.getItemList();

			if (itembean != null) {
				map.addAttribute("data", itembean);
			} else {
				map.addAttribute("msg", "Details Not Found");
			}

			return "searchPage";
		} else {
			map.addAttribute("msg", " Please Login First ");
			return "AdminLogin";
		}

	}
	@GetMapping("/additem")
	public String getAddPage(@SessionAttribute(name = "loggedInfo", required = false) ItemsBean itemBean,
			ModelMap map) {
		if (itemBean != null) {
			return "additem";
		} else {
			map.addAttribute("msg", " Please Login First ");
			return "AdminLogin";
		}
	}
		@PostMapping("/Additems")
		public String addEmployeeDetails(@SessionAttribute(name = "loggedInfo", required = false) ItemsBean infoBean,
				ItemsBean itembean, ModelMap map) {
			if (infoBean != null) {
				if (service.additems(itembean)) {
					map.addAttribute("msg", "Employee Details Added");
				} else {
					map.addAttribute("errMsg", "Details already exists");
				}
				return "Additems";
			} else {
				map.addAttribute("msg", " Please Login First ");
				return "AdminLogin";
			}


	}
		@GetMapping("/update")
		public String getUpdateFrom(@SessionAttribute(name = "loggedInfo", required = false) ItemsBean infoBean,
				ModelMap map) {
			if (infoBean != null) {
				map.addAttribute("id", infoBean.getUserid());
				return "update";
			} else {
				map.addAttribute("msg", " Please Login First ");
				return "AdminLogin";
			}
		}

		@PostMapping("/Update")
		public String getUpdateData(ItemsBean ItemBean,
				@SessionAttribute(name = "loggedInfo", required = false) ItemsBean infoBean, ModelMap map) {
			if (infoBean != null) {
				if (service.updateItem(ItemBean)) {
					map.addAttribute("msg", "Details Updated");
				} else {
					map.addAttribute("msg", "Details Are not Updated");
				}

				map.addAttribute("id", infoBean.getUserid());
				return "Update";
			} else {
				map.addAttribute("msg", " Please Login First ");
				return "AdminLogin";
			}
		}
		
		@GetMapping("/removeitem")
		public String getDeleteForm(@SessionAttribute(name = "loggedInfo", required = false) ItemsBean infoBean,
				ModelMap map) {
			if (infoBean != null) {
				return "removeitem";
			} else {
				map.addAttribute("msg", " Please Login First ");
				return "AdminLogin";
			}
		}

		@GetMapping("/Removeitem")
		public String deletEmpData(Integer userid,
				@SessionAttribute(name = "loggedInfo", required = false) ItemsBean infoBean, ModelMap map) {
			if (infoBean != null) {
				if (service.removeItem(userid)) {
					map.addAttribute("msg", "Data Deleted Successfully");
				}

				return "Removeitem";
			} else {
				map.addAttribute("msg", " Please Login First ");
				return "AdminLogin";
			}
		}
}
