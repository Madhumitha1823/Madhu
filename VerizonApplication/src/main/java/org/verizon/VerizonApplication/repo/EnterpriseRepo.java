package org.verizon.VerizonApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.VerizonApplication.model.Enterprise;


@Repository
public interface EnterpriseRepo extends JpaRepository<Enterprise,Integer> {

}
