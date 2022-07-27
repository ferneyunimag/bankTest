package kcrs.testing.challenge.test.example.services.client;

import kcrs.testing.challenge.test.example.domain.Client.ClientEntity;

import java.util.List;

public interface ClientServiceInterface {
    ClientEntity getClient(String id);
    List<ClientEntity> getAllClients();
    void  deleteClient(String id);
    void createClient(ClientEntity client);
}
