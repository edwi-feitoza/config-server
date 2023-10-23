package br.com.edwi.configserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class TesteController {

    @GetMapping
    public String qualquerBosta() {
        return "Vai pra cara do caraio!!!!";
    }
}
