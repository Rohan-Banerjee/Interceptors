package com.example.interceptor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


	@GetMapping("/users")
	public List<String> getUsers()
	{
		final List<String> users = new ArrayList<>();
		users.add("rohan");
		users.add("rohit");
		
		return users;
	}
}
