package org.verizon.VerizonApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.VerizonApplication.model.ComService;


@Repository
public interface ComServiceRepo extends JpaRepository<ComService,Integer> {

}
