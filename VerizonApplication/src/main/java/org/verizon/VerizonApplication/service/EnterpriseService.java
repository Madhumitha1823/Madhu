package org.verizon.VerizonApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.VerizonApplication.model.Enterprise;
import org.verizon.VerizonApplication.repo.EnterpriseRepo;

@Service
public class EnterpriseService {
	
	private final EnterpriseRepo eprepo;
	@Autowired
	public EnterpriseService(EnterpriseRepo eprepo) {
		this.eprepo = eprepo;
	}
	
	public List<Enterprise> getAllEnterprise()
	{
		return eprepo.findAll();
	}
    public Enterprise createEnterprise(Enterprise eprise)
    {
    	return eprepo.save(eprise);
    }
	
	

}
