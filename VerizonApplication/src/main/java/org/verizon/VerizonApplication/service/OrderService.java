package org.verizon.VerizonApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.VerizonApplication.model.OrderModel;
import org.verizon.VerizonApplication.repo.OrderRepo;
@Service
public class OrderService {
	private final OrderRepo odrepo;
	@Autowired
	public OrderService(OrderRepo odrepo) {
		this.odrepo = odrepo;
	}
	
	public List<OrderModel> getAllOrder()
	{
		return odrepo.findAll();
	}
    public OrderModel createordermodel(OrderModel order)
    {
    	return odrepo.save(order);
    }
	
}
