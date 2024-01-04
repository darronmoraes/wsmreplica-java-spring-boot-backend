package com.darron.wsmreplica.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Index {

    @GetMapping("/index")
    public String welcomeHomeWaterSportsManagement() {
        log.info("INDEX: /index endpoint");
        return "Welcome, Water Sports Management Home.";
    }
}
