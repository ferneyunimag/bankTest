package kcrs.testing.challenge.test.example.domain.Account;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Account {
    private String id;
    private String acountNumber;
    private String typeAccount;


    public Account(String id, String acountNumber, String typeAccount) {
        validate(id,acountNumber,typeAccount);
        this.id = id;
        this.acountNumber = acountNumber;
        this.typeAccount = typeAccount;
    }

    private void validate(String id, String acountNumber, String typeAccount){
    }

}
