package com.attornatusProcuradoriaDigital.controllers;


import com.attornatusProcuradoriaDigital.entities.Pessoa;
import com.attornatusProcuradoriaDigital.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    // Composiçao
    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> findAll(){
        return repository.findAll();

    }

}
