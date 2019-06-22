package com.qphone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qphone.pojo.DeptBean;
import com.qphone.service.DeptBeanService;
@Controller
public class DeptBeanController {
	@Autowired
	private DeptBeanService deptBeanService;
@RequestMapping("/show")
public String selectAll(Model model){
	List<DeptBean> list=deptBeanService.selectAll();
	model.addAttribute("list", list);
	return "show";
	
}
	@RequestMapping("/adddept")
	public String addDept(){
		
		return "input";
	}
	@RequestMapping(value="/adddept",method=RequestMethod.POST)
	public String deptAdd(DeptBean dept){
		
		deptBeanService.insertDept(dept);
		return "redirect:show";
	}
	@RequestMapping("/deletedept")
	public String deleteDept(int id){
		
		deptBeanService.deleteDept(id);
		return "redirect:show";
	}
	@RequestMapping("/updatedept")
	public String updateDept(int id,Model model){
		System.out.println(id);
		DeptBean dept=deptBeanService.selectOne(id);
		model.addAttribute("dept", dept);
		return "update";
	}
	@RequestMapping(value="/updatedept",method=RequestMethod.POST)
	public String updateDept(DeptBean dept){
		System.out.println(dept);
		deptBeanService.updateDept(dept);
		return "redirect:show";
		
		
	}
}
