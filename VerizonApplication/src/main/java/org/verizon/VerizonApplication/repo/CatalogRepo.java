package org.verizon.VerizonApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.VerizonApplication.model.Catalogmodel;


@Repository
public interface CatalogRepo extends JpaRepository<Catalogmodel,Integer> {

}
