package org.mirza.springjavakubernetes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public ResponseEntity helloController() {
        return ResponseEntity.ok("Hi, this is v1 project");
    }
}
