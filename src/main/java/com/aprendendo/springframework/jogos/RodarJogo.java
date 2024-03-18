package com.aprendendo.springframework.jogos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RodarJogo {

    private JogoConsole jogo;

    public RodarJogo(@Qualifier("JogoDoContraQualifier") JogoConsole jogo) {
        this.jogo = jogo;
    }

    public void rodar () {
        System.out.println("O jogo que está sendo rodado é: " + jogo);
        jogo.direita();
        jogo.baixo();
        jogo.cima();
        jogo.esquerda();
    }
}
