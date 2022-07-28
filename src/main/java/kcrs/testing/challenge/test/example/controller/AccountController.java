package kcrs.testing.challenge.test.example.controller;

import kcrs.testing.challenge.test.example.domain.Account.AccountEntity;
import kcrs.testing.challenge.test.example.exception.DataBase.DataBaseException;
import kcrs.testing.challenge.test.example.services.account.AccountServiceInterface;
import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.time.ZonedDateTime;
import java.util.List;

@Controller
@RequestMapping(name = "/account")
public class AccountController {
    @Autowired
    AccountServiceInterface accountService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody AccountEntity getAccount(@PathVariable String id) {
        return accountService.findAccountByID(id);

    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<AccountEntity> getAccount() {
        return accountService.getAllAccounts();

    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity CreateAccount(@RequestBody AccountEntity accountEntity) {
        accountService.createAccount(accountEntity);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity DeleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
