package kcrs.testing.challenge.test.example.services.account;

import kcrs.testing.challenge.test.example.domain.Account.AccountEntity;

import kcrs.testing.challenge.test.example.exception.DataBase.DataBaseException;
import kcrs.testing.challenge.test.example.exception.services.AlreadyExistException;
import kcrs.testing.challenge.test.example.exception.services.NotFoundException;
import kcrs.testing.challenge.test.example.repositories.AccountDAORepository;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class AccountService implements AccountServiceInterface {
    @Autowired
    AccountDAORepository accountDAORepository;

    @Override
    public AccountEntity findAccountByID(String id) {
        Optional optional = accountDAORepository.findById(id);
        if (!(optional.isPresent())) {
            throw new NotFoundException("f001",
                    "acount whith id: " + id + " doesn't exist",
                    ZonedDateTime.now());
        }
        return (AccountEntity) optional.get();
    }

    @Override
    public List<AccountEntity> getAllAccounts() {
        return accountDAORepository.findAll();
    }

    @Override
    public void deleteAccount(String id) {
        isPresent(id);
        accountDAORepository.deleteById(id);

    }

    @Override
    public void createAccount(AccountEntity account) {
        try {
            accountDAORepository.save(account);
        } catch (Exception e) {
            throw new DataBaseException("DB001", e.getCause().toString()+e.getMessage(), ZonedDateTime.now());
        }
    }

    @Override
    public AccountEntity findAccountByAccountNumber(String accountNumber) {
        return accountDAORepository.findByAccountNumber(accountNumber);

    }

    private void isPresent(String id) {
        java.util.Optional optional = accountDAORepository.findById(id);

        if (!(optional.isPresent())) {
            throw new NotFoundException("f001",
                    "acount whith id: " + id + " doesn't exist",
                    ZonedDateTime.now());
        }
        optional.isPresent();
    }


}
