package com.bocsoft.rdm.sample.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bocsoft.rdm.sample.api.GreetService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference(version = "1.0.2")
    GreetService greet;

    @RequestMapping("/hi")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<String> hi(@RequestParam(value="name", defaultValue="World") String name) {
        return ResponseEntity.ok().body(greet.sayHi(name));

    }

    @RequestMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body("login client");

    }
}
