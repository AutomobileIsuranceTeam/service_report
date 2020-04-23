package cn.sz.lh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.lh.pojo.Car_Accident;
import cn.sz.lh.service.ICar_AccidentService;

@Controller
@RequestMapping("/caraccident")
public class Car_AccidentControl {

	@Autowired
	private ICar_AccidentService carservice;
	
	@ResponseBody
	@RequestMapping(value="/addcarphoto",method=RequestMethod.POST)
	public String addcarevent(@RequestBody Car_Accident caraccident) {
		if(carservice.addcarevent(caraccident).equals("default")) {
			return "default";
		}
		return "suc";
	}
}
