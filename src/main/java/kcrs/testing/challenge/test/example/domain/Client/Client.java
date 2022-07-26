package kcrs.testing.challenge.test.example.domain.Client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Client {

    private  String name;
    private String LastName;
    private String id;
    private String  email;

    public Client(String name, String lastName, String id, String email) {
       validate(name,lastName,id,email);
        this.name = name;
        LastName = lastName;
        this.id = id;
        this.email = email;
    }

     private void validate(String name, String lastName, String id, String email){


            }

}
