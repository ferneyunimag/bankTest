package kcrs.testing.challenge.test.example.repositories;

import kcrs.testing.challenge.test.example.controller.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAOInterface extends JpaRepository<ClientEntity,String> {
}
