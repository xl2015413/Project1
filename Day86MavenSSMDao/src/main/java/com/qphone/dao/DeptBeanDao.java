package com.qphone.dao;

import java.util.List;

import com.qphone.pojo.DeptBean;

public interface DeptBeanDao {
	public List<DeptBean> selectAll();//查询所有部门
	public int insertDept(DeptBean dept);//增加部门
	public int deleteDept(int id);//删除部门
	public int updateDept(DeptBean dept);//修改部门
	public DeptBean selectOne(int id);//查询一个部门
}
