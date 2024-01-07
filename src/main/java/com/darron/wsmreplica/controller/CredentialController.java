package com.darron.wsmreplica.controller;

import com.darron.wsmreplica.entity.Credential;
import com.darron.wsmreplica.service.CredentialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CredentialController {

    @Autowired
    private CredentialService credentialService;

    @GetMapping("/credentials")
    public List<Credential> fetchAll() {
        log.info("ENDPOINT HIT: /credentials");
        return credentialService.fetchAllCredentials();
    }

    @GetMapping("/credentials/{id}")
    public Credential getCredential(@PathVariable int id) {
        return credentialService.credential(id);
    }

    @PostMapping("/credentials")
    public Credential saveCredential(@RequestBody Credential credential) {
        return credentialService.saveCredential(credential);
    }

}
