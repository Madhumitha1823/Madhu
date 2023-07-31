package org.verizon.VerizonApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.VerizonApplication.model.Enterprise;
import org.verizon.VerizonApplication.service.EnterpriseService;

@RestController
@RequestMapping("/api/eprise")
public class EnterpriseController {
	private EnterpriseService epservice;
	
	@Autowired
	public EnterpriseController(EnterpriseService epservice) {
		this.epservice = epservice;
	}
	@GetMapping("/alleprise")
	public List<Enterprise>getAllenterprise(){
		return epservice.getAllEnterprise();
	}
	@PostMapping("/insert")
	public Enterprise crateEnterprise(@RequestBody Enterprise eprise) {
		return epservice.createEnterprise(eprise);
	}
	
	
}