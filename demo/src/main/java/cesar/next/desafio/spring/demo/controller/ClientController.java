package cesar.next.desafio.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import cesar.next.desafio.spring.demo.entities.Client;
import cesar.next.desafio.spring.demo.repositories.ClientRepository;

@RequestMapping("/client")
public class ClientController {
@Autowired
private ClientRepository ClientRepository;

    @GetMapping
    public ResponseEntity<List<Client>> getClient() {
        return new ResponseEntity<List<Client>>(ClientRepository.findAll(), HttpStatus.OK);
        
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> getProdutoById(@PathVariable Long id) {
//é comum ao usar Optional em consultas de banco de dados, onde você deseja buscar um 
//registro, mas não tem certeza se ele existe. 
        Optional<Client>clientOptional = ClientRepository.findById(id);
        if (clientOptional.isPresent()) {
            
            return new ResponseEntity<Client>(clientOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        ClientRepository.save(client);
        return new ResponseEntity<Client>(client, HttpStatus.CREATED);

    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> updatedClientToId(@RequestBody @PathVariable Long id){
        Optional<Client>clientOptional=ClientRepository.findById(id);
        if(clientOptional.isPresent()){
            Client existe=clientOptional.get();
            existe.setAge(updatedClientToId.getAge());
            existe
        }
    }
}