package com.aprendendo.springframework.jogos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JogoDoMario implements JogoConsole{
    public void cima() {
        System.out.println("Pular");
    }

    public void baixo() {
        System.out.println("Entrar em um cano");
    }

    public void esquerda() {
        System.out.println("Voltar");
    }

    public void direita(){
        System.out.println("Correr");
    }
}
