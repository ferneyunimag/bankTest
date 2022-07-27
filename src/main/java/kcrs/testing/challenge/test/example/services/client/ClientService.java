package kcrs.testing.challenge.test.example.services.client;

import kcrs.testing.challenge.test.example.domain.Client.ClientEntity;
import kcrs.testing.challenge.test.example.repositories.ClientDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientService implements ClientServiceInterface {
    @Autowired
    ClientDAORepository clientDAOInterface;

    public ClientEntity getClient(String id) {
        Optional optional = clientDAOInterface.findById(id);
        if (optional.isPresent()) {
            return (ClientEntity) optional.get();
        }
        return null;
    }

    public List<ClientEntity> getAllClients() {

        return clientDAOInterface.findAll();
    }

    public void deleteClient(String id) {
        Optional optional = clientDAOInterface.findById(id);
        if (optional.isPresent()) {
            clientDAOInterface.deleteById(id);
        }

    }

    public void createClient(ClientEntity client) {
        Optional optional = clientDAOInterface.findById(client.getId());
        if (optional.isPresent()) {
            return;
        }
        clientDAOInterface.save(client);

    }

}
