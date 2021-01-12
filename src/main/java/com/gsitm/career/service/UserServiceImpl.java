package com.gsitm.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gsitm.career.dto.UserDTO;
import com.gsitm.career.mapper.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService {


	@Autowired
	private UserMapper mapper;

	@Override
	public int createUser(UserDTO user) {
		System.out.println(user + "mapper complite");
		return mapper.createUser(user);
	}
}
