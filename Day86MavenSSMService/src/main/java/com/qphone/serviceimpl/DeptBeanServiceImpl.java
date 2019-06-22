package com.qphone.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qphone.dao.DeptBeanDao;
import com.qphone.pojo.DeptBean;
import com.qphone.service.DeptBeanService;
@Service("deptBeanService")
public class DeptBeanServiceImpl implements DeptBeanService {
	@Autowired
	private DeptBeanDao deptBeanDao;
	@Override
	public List<DeptBean> selectAll() {
		
		return deptBeanDao.selectAll();
	}
	@Override
	public int insertDept(DeptBean dept) {
		
		return deptBeanDao.insertDept(dept);
	}
	@Override
	public int deleteDept(int id) {
		
		return deptBeanDao.deleteDept(id);
	}
	@Override
	public DeptBean selectOne(int id) {
		
		return deptBeanDao.selectOne(id);
	}
	@Override
	public int updateDept(DeptBean dept) {
		
		return deptBeanDao.updateDept(dept);
	}

}
