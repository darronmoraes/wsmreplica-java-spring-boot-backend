package com.darron.wsmreplica.service;

import com.darron.wsmreplica.entity.Credential;
import com.darron.wsmreplica.repository.CredentialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CredentialService {

    @Autowired
    private CredentialRepository credentialRepository;

    public List<Credential> fetchAllCredentials() {
      log.info("Fetching all credentials");
      List<Credential> credentials = credentialRepository.findAll();
      log.info("Returning Credentials List");
      return credentials;
    }

    public Credential credential(int id) {
        log.info("Credential id : " + id);
        return credentialRepository.findById(id).orElseThrow();
    }

    public Credential saveCredential(Credential credential) {
        log.info("Credential: {}", credential);
        return credentialRepository.save(credential);
    }
}
