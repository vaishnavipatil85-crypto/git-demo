package com.example.user_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.user_service.dto.OrderDto;



@FeignClient(name="order-client", url="${application.service.orders.url}")
public interface UserClient {

	@GetMapping
	List<OrderDto> getOrders();
}
