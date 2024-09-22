package org.mirza.springjavakubernetes.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping("/")
    public ResponseEntity helloController() {
        log.info("Hello Controller hit!");
        return ResponseEntity.ok("Hi, this is v1 project");
    }
}
