package com.attornatusProcuradoriaDigital.gerenciadorPessoas;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.attornatusProcuradoriaDigital.entities")
@SpringBootApplication
public class GerenciadorPessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPessoasApplication.class, args);
	}

}
