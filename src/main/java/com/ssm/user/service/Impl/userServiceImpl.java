package com.ssm.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.user.dao.UserMapper;
import com.ssm.user.model.User;
import com.ssm.user.service.UserService;
@Service
public class userServiceImpl implements UserService{
	@Autowired
	private UserMapper um;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		int num=um.deleteByPrimaryKey(id);
		return num;
	}

	@Override
	public int insert(User record) {
		int num=um.insert(record);
		return num;
	}

	@Override
	public int insertSelective(User record) {
		int num=um.insertSelective(record);
		return num;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		User u=um.selectByPrimaryKey(id);
		return u;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		int num=um.updateByPrimaryKeySelective(record);
		return num;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		int num=um.updateByPrimaryKey(record);
		return num;
	}

}
