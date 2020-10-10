package com.xadmin.mockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.mockito.dao.UserRepository;
import com.xadmin.mockito.model.Response;
import com.xadmin.mockito.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public Response saveUSer(User user)
	{
		repository.save(user);
		return new Response("saved user with id" + user.getId(), Boolean.TRUE);
	}
	
	public Response getAllUsers()
	{
		List<User> users = repository.findAll();
		return new Response("number of User:"+ users.size(), Boolean.TRUE);
	}
}
