package br.rafaelSammarco.FirstProject.repositories;

import br.rafaelSammarco.FirstProject.entities.OrderItem;
import br.rafaelSammarco.FirstProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
