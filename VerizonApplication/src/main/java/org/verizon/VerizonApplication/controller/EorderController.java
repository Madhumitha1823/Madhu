package org.verizon.VerizonApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.VerizonApplication.model.Eorder;
import org.verizon.VerizonApplication.service.EorderService;

@RestController
@RequestMapping("/api/eorder")
public class EorderController {
	private EorderService eoservice;
	
	@Autowired
	public EorderController(EorderService eoservice) {
		this.eoservice = eoservice;
	}
	@GetMapping("/alleorder")
	public List<Eorder>getAlleorder(){
		return eoservice.getAllEorder();
	}
	@PostMapping("/insert")
	public Eorder createeorder(@RequestBody Eorder eorder) {
		return eoservice.createEorder(eorder);
	}
	
	
}