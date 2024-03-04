package com.aprendendo.springframework.jogos;

public class RodarJogo {

    JogoConsole jogo;

    public RodarJogo(JogoConsole jogo) {
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
