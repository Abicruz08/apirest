package com.demo.api;

import com.demo.api.metodos.MetodosSecuencias;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(ApiApplication.class, args);
		MetodosSecuencias secuencias = context.getBean(MetodosSecuencias.class);
		secuencias.ejecutarSecuencias();
	}

}
