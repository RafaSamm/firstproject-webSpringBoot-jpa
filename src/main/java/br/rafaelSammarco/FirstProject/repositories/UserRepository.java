package br.rafaelSammarco.FirstProject.repositories;

import br.rafaelSammarco.FirstProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
