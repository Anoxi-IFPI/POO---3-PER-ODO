package com.demo;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;

@RestController
@RequestMapping("/primeiro")

public class PrimeiroController {

    @GetMapping("hello")
    public String hello() {
        return "ola mundo";
    }

}
