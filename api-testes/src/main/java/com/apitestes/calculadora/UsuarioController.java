package com.apitestes.calculadora;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping
    public Object criarUsuario(@RequestBody Map<String, Object> usuario) {
        if (!usuario.containsKey("nome") || !usuario.containsKey("idade")) {
            return "Erro: JSON inválido. 'nome' e 'idade' são obrigatórios.";
        }

        return usuario;
    }
}