package cn.sz.lh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lh.dao.IRep_InfoDao;
import cn.sz.lh.pojo.Rep_Info;
import cn.sz.lh.service.IRep_InfoService;
@Service
public class Rep_InfoServiceImpl implements IRep_InfoService {

	@Autowired
	private IRep_InfoDao repdao;
	@Override
	public String addreport(Rep_Info rep) {

		if(rep==null) {
			return "default";
		}
		repdao.addreport(rep);
		return "suc";
	}

	@Override
	public String updatecarpic(Rep_Info rep) {

		if(rep==null) {
			return "default";
		}
		repdao.updatecarpic(rep);
		return "suc";
	}

	@Override
	public String updatepeoplepic(Rep_Info rep) {

		if(rep==null) {
			return "defaule";
		}
		repdao.updatepeoplepic(rep);
		return "suc";
	}
}
