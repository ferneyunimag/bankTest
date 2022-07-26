package kcrs.testing.challenge.test.example.controller.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "clients")
public class ClientEntity {
    @Id
    private String id;
    private String name;
    private String LastName;
    private String email;

    public ClientEntity(String name, String lastName, String id, String email) {
        this.name = name;
        LastName = lastName;
        this.id = id;
        this.email = email;
    }

    public ClientEntity() {
    }
}
