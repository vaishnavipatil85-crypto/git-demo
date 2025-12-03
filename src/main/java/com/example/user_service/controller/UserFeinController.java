package com.example.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_service.client.UserClient;
import com.example.user_service.dto.OrderDto;

import io.vavr.collection.List;

@RequestMapping("/user/api")
public class UserFeinController {
	
	@Autowired
	UserClient userClient;
	
	@GetMapping
	List<OrderDto> getOrders()
	{
		return (List<OrderDto>) userClient.getOrders();
	}

}
