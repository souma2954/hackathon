package com.soumadeep.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumadeep.order.entity.Order;
import com.soumadeep.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order createOrder(Order order) {
		Order responseOrder = orderRepository.save(order);
		return responseOrder;
	}
	public Optional<Order> getOrderById(int orderId) {
		Optional<Order> order = orderRepository.findById(orderId);
		return order;
	}
	public List<Order> getOrderByCustomerId(long customerId){
		//List<Order> ordersList = orderRepository.findAllById(()->customerId));
		return null;
	}
	
}
