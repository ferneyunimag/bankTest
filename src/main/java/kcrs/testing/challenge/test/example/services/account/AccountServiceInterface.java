package kcrs.testing.challenge.test.example.services.account;

import kcrs.testing.challenge.test.example.domain.Account.AccountEntity;


import java.util.List;

public interface AccountServiceInterface {
    AccountEntity findAccount(String id);
    List<AccountEntity> getAllAccounts();
    void  deleteAccount(String id);
    void createAccount(AccountEntity account);
}
