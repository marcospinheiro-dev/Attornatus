package com.attornatusProcuradoriaDigital.controllers;

import com.attornatusProcuradoriaDigital.entities.Endereco;
import com.attornatusProcuradoriaDigital.entities.Pessoa;
import com.attornatusProcuradoriaDigital.repositories.EnderecoRepository;
import com.attornatusProcuradoriaDigital.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    // Composiçao
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;


    @GetMapping
    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Pessoa listarPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id).get();

    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa) {

        List<Endereco> novoEndereco = new ArrayList<>();
        var p = new Pessoa();

        p.setId(pessoa.getId());
        p.setNome(pessoa.getNome());
        p.setDataNascimento(pessoa.getDataNascimento());
        p.setEndereco(novoEndereco);

        return pessoaRepository.save(p);

    }

    @PutMapping("/{id}")
    public void alterar(@RequestBody Pessoa pessoa) {
        pessoaRepository.save(pessoa);

    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        pessoaRepository.deleteById(id);

    }

}
