package org.verizon.VerizonApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.VerizonApplication.model.ComService;
import org.verizon.VerizonApplication.service.ComServiceService;

@RestController
@RequestMapping("/api/comser")
public class ComServiceController {
	private ComServiceService csservice;
	
	@Autowired
	public ComServiceController(ComServiceService csservice) {
		this.csservice = csservice;
	}
	@GetMapping("/allcomser")
	public List<ComService>getAllcomservive(){
		return csservice.getAllcomservice();
	}
	@PostMapping("/insert")
	public ComService createComService(@RequestBody ComService comser) {
		return csservice.createComService(comser);
	}
	
	
}