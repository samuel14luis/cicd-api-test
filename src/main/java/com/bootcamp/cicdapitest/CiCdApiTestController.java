package com.bootcamp.cicdapitest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("api")
@Tag(name = "CI/CD API Test", description = "CI/CD Test with Github Actions")
@CrossOrigin( value = { "*" })
@RequiredArgsConstructor
public class CiCdApiTestController {

    @GetMapping(value = "/test")
    public Mono<ResponseEntity<Flux<String>>> getAll() {
        return Mono.just(
                ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Flux.just("Hola, Roberto"))
        );
    }

}