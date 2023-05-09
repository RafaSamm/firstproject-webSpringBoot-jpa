package br.rafaelSammarco.FirstProject.repositories;

import br.rafaelSammarco.FirstProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
