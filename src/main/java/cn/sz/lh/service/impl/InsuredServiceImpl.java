package cn.sz.lh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lh.dao.IInsuredDao;
import cn.sz.lh.pojo.Insured;
import cn.sz.lh.service.IInsuredService;

@Service
public class InsuredServiceImpl implements IInsuredService {

	@Autowired
	private IInsuredDao insdao;
	@Override
	public Insured selectbyidcard(Insured ins) {

		if(ins==null) {
			return null;
		}
		return insdao.selectbyidcard(ins);
	}

}
