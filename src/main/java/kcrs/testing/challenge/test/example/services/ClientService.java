package kcrs.testing.challenge.test.example.services;

import kcrs.testing.challenge.test.example.controller.entities.ClientEntity;
import kcrs.testing.challenge.test.example.domain.Client.Client;
import kcrs.testing.challenge.test.example.repositories.ClientDAOInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientService {
    @Autowired
    ClientDAOInterface clientDAOInterface;

    public ClientEntity getClient(String id) {
        Optional optinal = clientDAOInterface.findById(id);

        return optinal.isPresent() ? (ClientEntity) optinal.get() : null;

    }

    public List<ClientEntity> getAllClients(){

        return  clientDAOInterface.findAll();
    }

    public  void  deleteClient(String id){
        clientDAOInterface.deleteById(id);
    }

    public void createClient(ClientEntity client){
        clientDAOInterface.save( client);
    }


}
