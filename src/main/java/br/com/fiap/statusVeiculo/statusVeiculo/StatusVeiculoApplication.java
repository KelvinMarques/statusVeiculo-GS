package br.com.fiap.statusVeiculo.statusVeiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan({"br.com.fiap.statusVeiculo.controllers"})
public class StatusVeiculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusVeiculoApplication.class, args);
	}

}
