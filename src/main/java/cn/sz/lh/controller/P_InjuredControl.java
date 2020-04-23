package cn.sz.lh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.lh.pojo.P_Injured;
import cn.sz.lh.service.IP_InjuredService;

@Controller
@RequestMapping("/injuredcontrol")
public class P_InjuredControl {

	@Autowired
	private IP_InjuredService peoservice;
	
	@ResponseBody
	@RequestMapping(value="/addpeophoto",method=RequestMethod.POST)
	public String addpeopleevent(@RequestBody P_Injured injuredpeo) {
		if(peoservice.addpeopleevent(injuredpeo).equals("default")) {
			return "default";
		}
		return "suc";
	}
}
