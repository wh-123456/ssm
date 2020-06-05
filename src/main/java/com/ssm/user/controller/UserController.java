package com.ssm.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.user.model.User;
import com.ssm.user.service.Impl.userServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private userServiceImpl userImpl;
	
	@RequestMapping("/selectByPrimaryKey")
	@ResponseBody
	public User selectByPrimaryKey(Integer id){
		User u=userImpl.selectByPrimaryKey(id);
		return u;
	}
	
	@RequestMapping("/hellojsp")
	public String hello(HttpServletRequest request){
		request.getSession().setAttribute("dm", "hello123456");
		return "hello";
	}

}
