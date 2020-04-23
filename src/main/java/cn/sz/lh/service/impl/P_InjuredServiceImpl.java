package cn.sz.lh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lh.dao.IP_InjuredDao;
import cn.sz.lh.pojo.P_Injured;
import cn.sz.lh.service.IP_InjuredService;
@Service
public class P_InjuredServiceImpl implements IP_InjuredService {

	@Autowired
	private IP_InjuredDao injureddao;
	@Override
	public String addpeopleevent(P_Injured injuredpeo) {

		if(injuredpeo==null) {
			return "default";
		}
		injureddao.addpeopleevent(injuredpeo);
		return "suc";
	}

}
