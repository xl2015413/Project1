package com.qphone.service;

import java.util.List;

import com.qphone.pojo.DeptBean;

public interface DeptBeanService {
	public List<DeptBean> selectAll();
	public int insertDept(DeptBean dept);
	public int deleteDept(int id);
	public DeptBean selectOne(int id);
	public int updateDept(DeptBean dept);
}
