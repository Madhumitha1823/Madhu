package org.verizon.VerizonApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.VerizonApplication.model.Eorder;
import org.verizon.VerizonApplication.repo.EorderRepo;

@Service
public class EorderService {
	
	private final EorderRepo eorepo;
	@Autowired
	public EorderService(EorderRepo eorepo) {
		this.eorepo = eorepo;
	}
	
	public List<Eorder> getAllEorder()
	{
		return eorepo.findAll();
	}
    public Eorder createEorder(Eorder eorder)
    {
    	return eorepo.save(eorder);
    }
	
	

}
