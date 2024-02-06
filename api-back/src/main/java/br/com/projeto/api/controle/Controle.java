package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.repositorio.Repositorio;

@RestController
public class Controle {
    
    @Autowired
    private Repositorio repositorio;

    @GetMapping("/")
    public String teste(){
        return "Hello Word";
    }

}
