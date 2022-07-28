package kcrs.testing.challenge.test.example.services.account;


import kcrs.testing.challenge.test.example.domain.Account.AccountEntity;

import java.util.List;
import java.util.Optional;

public interface AccountServiceInterface {
    AccountEntity findAccountByID(String id);

    List<AccountEntity> getAllAccounts();

    void deleteAccount(String id);

    void createAccount(AccountEntity account);

    AccountEntity findAccountByAccountNumber(String AccountNumber);
}
