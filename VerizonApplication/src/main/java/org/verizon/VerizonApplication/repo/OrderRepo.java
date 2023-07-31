package org.verizon.VerizonApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.VerizonApplication.model.OrderModel;

@Repository
public interface OrderRepo extends JpaRepository<OrderModel,Integer> {

}
