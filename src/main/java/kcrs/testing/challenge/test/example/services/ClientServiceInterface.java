package kcrs.testing.challenge.test.example.services;

import kcrs.testing.challenge.test.example.controller.entities.ClientEntity;

import java.util.List;

public interface ClientServiceInterface {
    ClientEntity getClient(String id);
    List<ClientEntity> getAllClients();
    void  deleteClient(String id);
    void createClient(ClientEntity client);
}
