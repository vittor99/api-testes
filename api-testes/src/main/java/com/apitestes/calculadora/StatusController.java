package com.apitestes.calculadora;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping
    public Map<String, Object> status() {
        Map<String, Object> resposta = new HashMap<>();
        resposta.put("status", "OK");
        resposta.put("timestamp", LocalDateTime.now());
        return resposta;
    }
}