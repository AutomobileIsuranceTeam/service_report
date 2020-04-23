package cn.sz.lh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.lh.pojo.Rep_Info;
import cn.sz.lh.service.IRep_InfoService;

@Controller
@RequestMapping("/report")
public class ReportControl {

	@Autowired
	private IRep_InfoService repservice;
	
	@ResponseBody
	@RequestMapping(value="/addonereport",method=RequestMethod.POST)
	public String addreportmethod(@RequestBody Rep_Info rep) {
		//添加基本报案信息方法
		if(repservice.addreport(rep).equals("default")) {
			return "default";
		}
		return "suc";
	}
	
	@ResponseBody
	@RequestMapping(value="/updatecarphoto",method=RequestMethod.POST)
	public String updatecaraccident(@RequestBody Rep_Info rep) {
		//添加车辆事故照片
		if(repservice.updatecarpic(rep).equals("default")) {
			return "default";
		}
		return "suc";
	}
	
	@ResponseBody
	@RequestMapping(value="/updatepeophoto",method=RequestMethod.POST)
	public String updatepeofei(@RequestBody Rep_Info rep) {
		//添加缴费单
		if(repservice.updatepeoplepic(rep).equals("default")) {
			return "default";
		}
		return "suc";
	}
}
