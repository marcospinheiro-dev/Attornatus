package com.attornatusProcuradoriaDigital.controllers;

import com.attornatusProcuradoriaDigital.entities.Pessoa;
import com.attornatusProcuradoriaDigital.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    // Composiçao
    @Autowired
    private PessoaRepository pessoaRepository;


    @GetMapping
    public List<Pessoa> listarTodos(){
        return pessoaRepository.findAll();
//        return lista;
    }
    @GetMapping(value = "/{id}")
    public Pessoa listarPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id).get();
    }
//    @GetMapping(value = "/{id}")
//    public Pessoa listarPorId(@PathVariable Long id) {
//        Pessoa resultado = pessoaRepository.findById(id).get();
//        return resultado;
//    }

    @PostMapping
    public Pessoa incluir(@RequestBody Pessoa pessoa) {
        Pessoa resultado = pessoaRepository.save(pessoa);
        return resultado;
    }
    @PutMapping
    public Pessoa alterar(@RequestBody Pessoa pessoa) {
        Pessoa resultado = pessoaRepository.save(pessoa);
        return resultado;

    }
    @DeleteMapping("{id}")
    public void excluir(@PathVariable Long id) {
        pessoaRepository.deleteById(id);

    }

}
