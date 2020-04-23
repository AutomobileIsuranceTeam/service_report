package cn.sz.lh.service;

import cn.sz.lh.pojo.Rep_Info;

public interface IRep_InfoService {

	public String addreport(Rep_Info rep);//添加报案信息
	
	public String updatecarpic(Rep_Info rep);//添加车辆事故照片
	
	public String updatepeoplepic(Rep_Info rep);//添加人伤缴费单照片
}
