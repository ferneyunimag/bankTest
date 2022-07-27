package kcrs.testing.challenge.test.example.services.account;

import kcrs.testing.challenge.test.example.domain.Account.AccountEntity;
import kcrs.testing.challenge.test.example.repositories.AccountDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AccountService implements AccountServiceInterface {
    @Autowired
    AccountDAORepository accountDAORepository;

    @Override
    public AccountEntity findAccount(String id) {
        Optional optional = accountDAORepository.findById(id);
        if (optional.isPresent()){
            return (AccountEntity) optional.get();
        }
        return null;
    }

    @Override
    public List<AccountEntity> getAllAccounts() {
        return  accountDAORepository.findAll();
    }

    @Override
    public void deleteAccount(String id) {
        if (isPresent(id)){
           accountDAORepository.deleteById(id);
        }
    }

    @Override
    public void createAccount(AccountEntity account) {
        if (isPresent(account.getId())){
           return;
        }
        accountDAORepository.save(account);
    }


    private boolean isPresent(String id){
        Optional optional = accountDAORepository.findById(id);
        return optional.isPresent();
    }



}
