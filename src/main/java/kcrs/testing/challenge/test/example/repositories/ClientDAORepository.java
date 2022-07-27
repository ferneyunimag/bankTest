package kcrs.testing.challenge.test.example.repositories;

import kcrs.testing.challenge.test.example.domain.Client.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAORepository extends JpaRepository<ClientEntity,String> {
}
