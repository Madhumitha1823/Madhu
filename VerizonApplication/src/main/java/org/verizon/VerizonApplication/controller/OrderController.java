package org.verizon.VerizonApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.VerizonApplication.model.OrderModel;
import org.verizon.VerizonApplication.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	private OrderService odservice;
	
	@Autowired
	public OrderController(OrderService odservice) {
		this.odservice = odservice;
	}
	@GetMapping("/allorder")
	public List<OrderModel>getAllorder(){
		return odservice.getAllOrder();
	}
	@PostMapping("/insert")
	public OrderModel createordermodel(@RequestBody OrderModel order) {
		return odservice.createordermodel(order);
	}
	
	
}
