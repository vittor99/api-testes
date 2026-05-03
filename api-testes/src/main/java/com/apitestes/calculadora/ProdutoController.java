package com.apitestes.calculadora;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> listaProdutos = new ArrayList<>();

    public ProdutoController() {
        listaProdutos.add(new Produto("Camisa", "vestuario"));
        listaProdutos.add(new Produto("Calça", "vestuario"));
        listaProdutos.add(new Produto("Notebook", "eletronicos"));
    }

    @GetMapping
    public List<Produto> listarProdutos(@RequestParam(required = false) String categoria) {
        if (categoria == null) {
            return listaProdutos;
        }

        List<Produto> filtrados = new ArrayList<>();
        for (Produto p : listaProdutos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}