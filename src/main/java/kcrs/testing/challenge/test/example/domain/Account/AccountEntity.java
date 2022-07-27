package kcrs.testing.challenge.test.example.domain.Account;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class AccountEntity {
    @Id
    private String id;
    private String acountNumber;
    private String typeAccount;
    private String status;
    private String balance;

    public AccountEntity(String id, String acountNumber, String typeAccount, String status, String balance) {
        this.id = id;
        this.acountNumber = acountNumber;
        this.typeAccount = typeAccount;
        this.status = status;
        this.balance = balance;
    }

    public AccountEntity() {

    }
}
