package com.test.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/admission")
	public String getAdmin() {
		return "admission";
	}
	@RequestMapping("/admissionList")
	public String getAdmissionList(){
		return "admissionList";
	}

}
