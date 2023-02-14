package com.attornatusProcuradoriaDigital.repositories;

import com.attornatusProcuradoriaDigital.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


}
