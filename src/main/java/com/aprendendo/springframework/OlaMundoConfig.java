package com.aprendendo.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Pessoa(String nome, int idade, Endereco endereco) { };
record Endereco(String estado, String cidade, String rua) {};
@Configuration
public class OlaMundoConfig {

    @Bean
    public String nome() {
        return "Zé Ricardo";
    }

    @Bean
    public int idade() {
        return 21;
    }

    @Bean
    public Pessoa pessoa () {
        return new Pessoa("José Ricardo", 21, new Endereco("Paraíba", "João Pessoa", "Maciel Medeiros Ferreira"));
    }

    @Bean(name = "endereco1")
    public Endereco endereco() {
        return new Endereco("Paraíba","João Pessoa", "Rua João Miguel de Souza");
    }

    @Bean
    public Pessoa pessoaParChamadoDeMetodoTresParametros(String nome, int idade, Endereco endereco1) {
        return new Pessoa(nome, idade, endereco1);
    }



}
