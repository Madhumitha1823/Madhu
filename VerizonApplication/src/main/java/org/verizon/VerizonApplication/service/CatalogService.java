package org.verizon.VerizonApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.VerizonApplication.model.Catalogmodel;
import org.verizon.VerizonApplication.repo.CatalogRepo;

@Service
public class CatalogService {
	
	private final CatalogRepo catrepo;
	@Autowired
	public CatalogService(CatalogRepo catrepo) {
		this.catrepo = catrepo;
	}
	
	public List<Catalogmodel> getAllCatalog()
	{
		return catrepo.findAll();
	}
    public Catalogmodel createCatalogModel(Catalogmodel catalog)
    {
    	return catrepo.save(catalog);
    }
	
	

}
