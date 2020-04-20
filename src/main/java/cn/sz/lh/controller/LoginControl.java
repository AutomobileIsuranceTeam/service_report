package cn.sz.lh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.lh.pojo.Manager;
import cn.sz.lh.service.IManagerService;

@Controller
@RequestMapping("/logincontrol")
public class LoginControl {

	@Autowired
	private IManagerService managerService;
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Manager Logincheck(@RequestBody Manager manager) {
		return managerService.checklogin(manager);
	}
}
