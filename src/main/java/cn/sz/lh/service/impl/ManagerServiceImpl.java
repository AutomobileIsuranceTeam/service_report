package cn.sz.lh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lh.dao.IManagerDao;
import cn.sz.lh.pojo.Manager;
import cn.sz.lh.service.IManagerService;

@Service
public class ManagerServiceImpl implements IManagerService {

	@Autowired
	private IManagerDao managerdao;
	
	@Override
	public Manager checklogin(Manager manager) {
		if(manager==null) {
			return null;
		}
		return managerdao.checklogin(manager);
	}

}
