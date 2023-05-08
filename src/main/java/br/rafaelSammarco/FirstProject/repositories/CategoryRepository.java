package br.rafaelSammarco.FirstProject.repositories;

import br.rafaelSammarco.FirstProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
