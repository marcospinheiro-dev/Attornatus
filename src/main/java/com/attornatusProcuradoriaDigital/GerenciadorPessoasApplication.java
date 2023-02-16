package com.attornatusProcuradoriaDigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//Estava dando "Whitelabel Error page", por isso coloquei a classe Application na pasta Grupo, funcionou.

@EntityScan(basePackages = "com.attornatusProcuradoriaDigital.entities")
@SpringBootApplication
public class GerenciadorPessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPessoasApplication.class, args);
	}

}
