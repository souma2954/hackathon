package com.soumadeep.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumadeep.order.entity.Order;
import com.soumadeep.order.service.OrderService;

@RestController
@RequestMapping("/order-service/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping()
	public Order createOrder(@RequestBody Order order) {
		Order orderResponse = orderService.createOrder(order);
		return orderResponse;
	}
	
	@GetMapping("{orderId}")
	public Order getOrderById(Long orderId) {
		Order order = orderService.getOrderById(orderId);
		return order;
	}
	
	@GetMapping("/customer/{customerId}")
	public List<Order> getOrdersBuCustomerId(Long customerId){
		List<Order> ordersList = orderService.getOrderByCustomerId(customerId);
		return ordersList;
	}
}
