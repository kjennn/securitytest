package com.gsitm.career.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gsitm.career.dto.UserDTO;

@Repository
@Mapper
public interface UserMapper {

	public int createUser(UserDTO user);
}
