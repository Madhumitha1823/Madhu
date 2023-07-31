package org.verizon.VerizonApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.VerizonApplication.model.Catalogmodel;
import org.verizon.VerizonApplication.service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {
	private CatalogService catservice;
	
	
	@Autowired
	public CatalogController(CatalogService catservice) {
		this.catservice = catservice;
	}
	@RequestMapping("/allcat")
	public List<Catalogmodel>getAllcatalog(){
		return catservice.getAllCatalog();
	}
	@PostMapping("/insert")
	public Catalogmodel createcatalogModel(@RequestBody Catalogmodel catalog) {
		return catservice.createCatalogModel(catalog);
	}

}

