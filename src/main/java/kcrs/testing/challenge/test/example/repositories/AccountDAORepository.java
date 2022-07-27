package kcrs.testing.challenge.test.example.repositories;

import kcrs.testing.challenge.test.example.domain.Account.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAORepository extends JpaRepository<AccountEntity,String> {
}
