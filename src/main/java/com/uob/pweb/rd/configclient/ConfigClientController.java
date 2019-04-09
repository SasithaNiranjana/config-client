package com.uob.pweb.rd.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ConfigClientController {
    @Value("${message:Default message}")
    String message;

    @GetMapping(value="/hello")
    Mono<String> getMessage(){
        return Mono.just(message);
    }
}
