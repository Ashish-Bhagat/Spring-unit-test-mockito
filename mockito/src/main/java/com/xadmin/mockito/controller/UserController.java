package com.xadmin.mockito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.mockito.model.Response;
import com.xadmin.mockito.model.User;
import com.xadmin.mockito.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService serivce;
	
	@PostMapping("/addUser")
	public Response save(@RequestBody User user)
	{
		return serivce.saveUSer(user);
	}
	
	@GetMapping("/getUsers")
	public Response getAllUsers()
	{
		return serivce.getAllUsers();
	}
}
