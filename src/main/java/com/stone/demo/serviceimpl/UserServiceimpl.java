package com.stone.demo.serviceimpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.stone.demo.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "bunana";
	}

}
