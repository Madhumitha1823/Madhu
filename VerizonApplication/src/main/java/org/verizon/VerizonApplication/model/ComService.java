package org.verizon.VerizonApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ComService {
@Id
private int con_id;
private int planid;
private String activity;
private String qos;
public ComService() {
	
}
public int getCon_id() {
	return con_id;
}
public void setCon_id(int con_id) {
	this.con_id = con_id;
}
public int getPlanid() {
	return planid;
}
public void setPlanid(int planid) {
	this.planid = planid;
}
public String getActivity() {
	return activity;
}
public void setActivity(String activity) {
	this.activity = activity;
}
public String getQos() {
	return qos;
}
public void setQos(String qos) {
	this.qos = qos;
}


}
