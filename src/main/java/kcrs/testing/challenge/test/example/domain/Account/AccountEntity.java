package kcrs.testing.challenge.test.example.domain.Account;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Data
@Entity
@Table(name="AccountData")
public class AccountEntity {

    @Id
    private String idClient;
    @Column(nullable = false,unique = true)
    private String accountNumber;
    private String typeAccount;
    private String status;
    private String balance;

    public AccountEntity(String id, String acountNumber, String typeAccount, String status, String balance) {
        this.idClient = id;
        this.accountNumber = acountNumber;
        this.typeAccount = typeAccount;
        this.status = status;
        this.balance = balance;
    }


    public AccountEntity() {

    }
}
