package kcrs.testing.challenge.test.example.controller;

import kcrs.testing.challenge.test.example.controller.entities.ClientEntity;
import kcrs.testing.challenge.test.example.services.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientServiceInterface clientServiceInterface;

    @GetMapping("/{id}")
    public @ResponseBody ClientEntity getClient(@PathVariable String id) {
        return clientServiceInterface.getClient(id);
    }


    @GetMapping("/")
    public @ResponseBody List<ClientEntity> getAllClients() {
        return clientServiceInterface.getAllClients();
    }

    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE)
    public  void saveClient(@RequestBody ClientEntity client){
        clientServiceInterface.createClient(client);
    }



}
