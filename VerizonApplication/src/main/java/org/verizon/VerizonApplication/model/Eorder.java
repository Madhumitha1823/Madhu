package org.verizon.VerizonApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Eorder {

	@Id
	private int eorderid;
	private int eplanid;
	public Eorder() {
		
	}
	public int getEorderid() {
		return eorderid;
	}
	public void setEorderid(int eorderid) {
		this.eorderid = eorderid;
	}
	public int getEplanid() {
		return eplanid;
	}
	public void setEplanid(int eplanid) {
		this.eplanid = eplanid;
	}
	
}
