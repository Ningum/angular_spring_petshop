package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins = "*")
public class Controle {
    
    @Autowired
    private Repositorio repositorio;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return repositorio.save(cliente);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return repositorio.findAll();
    }

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente cliente) {
        return repositorio.save(cliente);
    }
    
    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        repositorio.deleteById(codigo);
    }

}