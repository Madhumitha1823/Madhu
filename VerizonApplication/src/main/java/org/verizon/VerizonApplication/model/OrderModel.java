package org.verizon.VerizonApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderModel {
	@Id
	private int orderId;
	private int planId;
	public OrderModel() {
		}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	
}
