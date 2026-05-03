package com.apitestes.calculadora;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/dividir")
    public Object dividir(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            return "Erro: divisão por zero não é permitida";
        }
        return a / b;
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }
}