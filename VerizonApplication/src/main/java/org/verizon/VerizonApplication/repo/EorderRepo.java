package org.verizon.VerizonApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.VerizonApplication.model.Eorder;


@Repository
public interface EorderRepo extends JpaRepository<Eorder,Integer> {

}
