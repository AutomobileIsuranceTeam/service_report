package cn.sz.lh.dao;

import cn.sz.lh.pojo.Rep_Info;

public interface IRep_InfoDao {

	public void addreport(Rep_Info rep);//添加报案信息
	
	public void updatecarpic(Rep_Info rep);//添加车辆事故照片
	
	public void updatepeoplepic(Rep_Info rep);//添加人伤缴费单照片
}
