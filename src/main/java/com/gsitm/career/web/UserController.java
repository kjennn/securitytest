package com.gsitm.career.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gsitm.career.dto.UserDTO;
import com.gsitm.career.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserController {


		@Autowired
		UserService userservice;

	  @GetMapping("/register")
	    public String create(HttpServletRequest request){

	      log.info("User controller");
	      return "/user/login/register";
	    }

	  @PostMapping("/register")
	    public String createUser(HttpServletRequest request){

		  UserDTO user = new UserDTO();
		  user.setUserId(request.getParameter("id"));
		  user.setUserPw(request.getParameter("password"));
		  user.setUserName(request.getParameter("name"));
		  user.setUserRole(request.getParameter("role"));

		  userservice.createUser(user);

	      log.info("User controller");
	      return "home";
	    }




}
