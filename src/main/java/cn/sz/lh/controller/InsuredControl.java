package cn.sz.lh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.lh.pojo.Insured;
import cn.sz.lh.service.IInsuredService;

@Controller
@RequestMapping("/inscontrol")
public class InsuredControl {

	@Autowired
	private IInsuredService insservice;
	
	@ResponseBody
	@RequestMapping(value="/selectbyidcard",method=RequestMethod.POST)
	public Insured selectByidcar(@RequestBody Insured ins) {
		return insservice.selectbyidcard(ins);
	}
}
