package br.com.fiap.abctechservice.repository;

import br.com.fiap.abctechservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOperatorId (Long operatorId);
}

