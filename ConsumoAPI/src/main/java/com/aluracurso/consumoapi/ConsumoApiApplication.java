package com.aluracurso.consumoapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumoApiApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main();

        main.menu();
    }
}
