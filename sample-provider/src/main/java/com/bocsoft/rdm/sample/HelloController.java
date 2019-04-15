package com.bocsoft.rdm.sample;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bocsoft.rdm.sample.api.GreetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {


    @RequestMapping("/log1in")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body("login");

    }


        @GetMapping("/user/me")
        public Principal user(Principal principal) {
            return principal;
        }

}
