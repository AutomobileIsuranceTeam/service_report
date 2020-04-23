package cn.sz.lh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lh.dao.ICar_AccidentDao;
import cn.sz.lh.pojo.Car_Accident;
import cn.sz.lh.service.ICar_AccidentService;
@Service
public class Car_AccidentServiceImpl implements ICar_AccidentService {

	@Autowired
	private ICar_AccidentDao cardao;
	@Override
	public String addcarevent(Car_Accident caraccident) {

		if(caraccident==null) {
			return "default";
		}
		cardao.addcarevent(caraccident);
		return "suc";
	}

}
