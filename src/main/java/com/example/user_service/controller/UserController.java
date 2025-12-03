/*package com.example.user_service.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Date;
import com.example.user_service.dto.OrderDto;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RequestMapping("/userservice")
@RestController
public class UserController {
	
@Autowired	
@Lazy
RestTemplate restTemplate;	

public static final String USER_SERVICE = "userService";

private static final String BASEURL = "http://localhost:8082/orders";
private int attempt=1;


@GetMapping("/displayorders")
//@CircuitBreaker(name=USER_SERVICE,fallbackMethod="getAllAvailableProducts")
//@Retry(name=USER_SERVICE,fallbackMethod="getAllAvailableProducts")
public List<OrderDto> displayOrders(@RequestParam("category") String category)
{
	String url = category == "" ? BASEURL: BASEURL +"/"+category;
	System.out.println(" url :"+url);
	
	 System.out.println("retry method called "+attempt++ +" times "+" at "+new Date());
	 
	return restTemplate.getForObject(url, ArrayList.class);
}

public List<OrderDto> getAllAvailableProducts(Exception e){
    return Stream.of(
            new OrderDto(119, "LED TV", "electronics", "white", 45000),
            new OrderDto(345, "Headset", "electronics", "black", 7000),
            new OrderDto(475, "Sound bar", "electronics", "black", 13000),
            new OrderDto(574, "Puma Shoes", "foot wear", "black & white", 4600),
            new OrderDto(678, "Vegetable chopper", "kitchen", "blue", 999),
            new OrderDto(532, "Oven Gloves", "kitchen", "gray", 745)
    ).collect(Collectors.toList());
}

}*/
