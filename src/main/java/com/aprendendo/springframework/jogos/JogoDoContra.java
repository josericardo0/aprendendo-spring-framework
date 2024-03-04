package com.aprendendo.springframework.jogos;

public class JogoDoContra implements JogoConsole {

    public void cima() {
        System.out.println("Pular");
    }

    public void baixo() {
        System.out.println("Abaixar");
    }

    public void esquerda() {
        System.out.println("Voltar");
    }

    public void direita(){
        System.out.println("Atirar uma bala");
    }
}
