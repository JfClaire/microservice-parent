package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

	@Override
	public boolean update() {
		List<Dept> depts = new ArrayList<>();
		for (int i = 0; i < 2;i++) {
			Dept dept = new Dept();
			dept.setDeptno(Long.valueOf(i)).setDname("111");

			depts.add(dept);
		}
		int update = dao.update(depts);
		if(update > 0) {
			return true;
		}
		return false;
	}

}