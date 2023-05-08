package br.rafaelSammarco.FirstProject.repositories;

import br.rafaelSammarco.FirstProject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
