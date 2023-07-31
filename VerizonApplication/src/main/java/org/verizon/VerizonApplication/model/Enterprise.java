package org.verizon.VerizonApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Enterprise {

	@Id
	private int e_id;
	private String ename;
	private int oid;
	
	public Enterprise() {
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}
	
	
}
