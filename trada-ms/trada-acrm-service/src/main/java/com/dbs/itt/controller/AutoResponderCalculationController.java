package com.dbs.itt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/autoresponder")
public class AutoResponderCalculationController {

    @GetMapping("/")
    public ResponseEntity<String> getAutoResponder() {
        return ResponseEntity.ok("Hello Auto-Responder");
    }
}
