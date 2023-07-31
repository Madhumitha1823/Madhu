package org.verizon.VerizonApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.VerizonApplication.model.ComService;
import org.verizon.VerizonApplication.repo.ComServiceRepo;

@Service
public class ComServiceService {
	
	private final ComServiceRepo csrepo;
	@Autowired
	public ComServiceService(ComServiceRepo csrepo) {
		this.csrepo = csrepo;
	}
	
	public List<ComService> getAllcomservice()
	{
		return csrepo.findAll();
	}
    public ComService createComService(ComService comservice)
    {
    	return csrepo.save(comservice);
    }
	
	

}
