package com.test.alianza.controller;

import com.test.alianza.model.dto.ClientDto;
import com.test.alianza.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping()
    private ResponseEntity<List<ClientDto>> getAllClients() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/shared-key/{shared-key}")
    private ResponseEntity<ClientDto> getClientBySharedKey(@PathVariable("shared-key") String sharedKey) {
        return service.findBySharedKey(sharedKey).map(client -> new ResponseEntity<>(client, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/business-id/{business-id}")
    private ResponseEntity<ClientDto> getClientByBusinessId(@PathVariable("business-id") String businessId) {
        return service.findByBusinessId(businessId).map(client -> new ResponseEntity<>(client, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    private ResponseEntity<ClientDto> saveClient(@RequestBody ClientDto clientDto) {
        return new ResponseEntity<>(service.save(clientDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/shared-key/{shared-key}")
    private ResponseEntity<String> deleteClient(@PathVariable("shared-key") String sharedKey) {
        return new ResponseEntity<>(service.deleteBySharedKey(sharedKey) ? "Deleted successfully" : "Not found", service.deleteBySharedKey(sharedKey) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
