package com.attornatusProcuradoriaDigital.controllers;

import com.attornatusProcuradoriaDigital.entities.Pessoa;
import com.attornatusProcuradoriaDigital.repositories.PessoaRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    // Composiçao
    @Autowired
    private PessoaRepository repository;


    @GetMapping
    public List<Pessoa> buscarTodos(){
        List<Pessoa> lista = repository.findAll();
        return lista;
    }
    @GetMapping(value = "/{id}")
    public Pessoa buscarPorId(@PathVariable Long id){
        Pessoa resultado = repository.findById(id).get();
        return resultado;

    }
    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        Pessoa resultado = repository.save(pessoa);
        return resultado;

    }

}
