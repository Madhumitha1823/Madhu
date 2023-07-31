package org.verizon.VerizonApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Catalogmodel {
	
	@Id
	private int planId;
	private String plan;
	private int price;
	private String duration;
	
	public Catalogmodel() {
		
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}

