package com.dio.padroesdeprojetoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**Projeto em Springbooot gerado Via Spring Initializer
 * os seguintes modulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * @author ArthurVenicio
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoSpringApplication.class, args);
	}

}
